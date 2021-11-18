package student_oleg_kozlov.lesson_12.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Task_13
class BankApiImplTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static List<BankClient> clients = generateClients();

    public static void main(String[] args) {
        findByUidTestClientFound();
        findByUidTestClientNotFound();
        findByUidTestAccessDenied();
        printFooter();
    }

    private static void findByUidTestClientFound() {
        totalRun++;
        BankApi api = new BankApiImpl(clients);
        BankClient actual;
        try {
            actual = unwrap(api.findByUid(generateCredentials(Role.CAN_SEARCH_CLIENTS), "2"));
            checkResult(clients.get(1), actual, "findByUidTestClientFound");
        } catch (AccessDeniedException e) {
            unexpectedExceptionCaught("findByUidTestClientFound");
        }
    }

    private static void findByUidTestClientNotFound() {
        totalRun++;
        BankApi api = new BankApiImpl(clients);
        BankClient actual;
        try {
            actual = unwrap(api.findByUid(generateCredentials(Role.CAN_SEARCH_CLIENTS), "4"));
            checkResult(new BankClient(null, null), actual, "findByUidTestClientNotFound");
        } catch (AccessDeniedException e) {
            unexpectedExceptionCaught("findByUidTestClientNotFound");
        }
    }

    private static void findByUidTestAccessDenied() {
        totalRun++;
        BankApi api = new BankApiImpl(clients);
        try {
            api.findByUid(generateCredentials(), "1");
            expectedExceptionNotCaught("findByUidTestAccessDenied");
        } catch (AccessDeniedException e) {
            expectedExceptionCaught("findByUidTestAccessDenied");
        }
    }

    private static void expectedExceptionCaught(String testName) {
        System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
        totalPassed++;
    }

    private static void unexpectedExceptionCaught(String testName) {
        System.out.println(TEXT_RED + testName + " - failed");
        System.out.println("Expected: no exception");
        System.out.println("Actual:   exception caught" + TEXT_RESET);
        totalFailed++;
    }

    private static void expectedExceptionNotCaught(String testName) {
        System.out.println(TEXT_RED + testName + " - failed");
        System.out.println("Expected: exception caught");
        System.out.println("Actual:   no exception " + TEXT_RESET);
        totalFailed++;
    }

    private static void checkResult(BankClient expected, BankClient actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }

    private static List<BankClient> generateClients() {
        List<BankClient> clients = new ArrayList<>();
        clients.add(new BankClient("1", "Client1"));
        clients.add(new BankClient("2", "Client2"));
        clients.add(new BankClient("3", "Client3"));
        return clients;
    }

    private static UserCredentials generateCredentials(Role... roles) {
        List<Role> rolesList = Arrays.asList(roles);
        return new UserCredentials(rolesList);
    }

    private static BankClient unwrap(Optional<BankClient> optClient) {
        return optClient.isPresent() ? optClient.get() : new BankClient(null, null);
    }
}
