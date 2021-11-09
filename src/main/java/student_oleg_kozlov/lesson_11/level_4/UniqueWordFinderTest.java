package student_oleg_kozlov.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

// Task_27
class UniqueWordFinderTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static UniqueWordFinder finder = new UniqueWordFinder();

    public static void main(String[] args) {
        shouldFindUniqueWordsTest1();
        shouldFindUniqueWordsTest2();
        shouldFindUniqueWordsTest3();
        printFooter();
    }

    private static void shouldFindUniqueWordsTest1() {
        totalRun++;
        Set<String> expected = new HashSet<>();
        expected.add("not");
        expected.add("unique");
        expected.add("word");
        expected.add("here");
        expected.add("is");
        checkResult(expected, finder.find("Not unique word here is - unique."),"shouldFindUniqueWordsTest1");
    }

    private static void shouldFindUniqueWordsTest2() {
        totalRun++;
        Set<String> expected = new HashSet<>();
        expected.add("unique");
        expected.add("not");
        checkResult(expected, finder.find("Unique, unique... Not unique!"),"shouldFindUniqueWordsTest2");
    }

    private static void shouldFindUniqueWordsTest3() {
        totalRun++;
        Set<String> expected = new HashSet<>();
        expected.add("ааа");
        expected.add("ббб");
        expected.add("ввв");
        expected.add("ддд");
        expected.add("аа");
        checkResult(expected, finder.find("ааа ббб ввв Ддд ВВВ ддд аа"),"shouldFindUniqueWordsTest3");
    }

    private static void checkResult(Set<String> expected, Set<String> actual, String testName) {
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
}
