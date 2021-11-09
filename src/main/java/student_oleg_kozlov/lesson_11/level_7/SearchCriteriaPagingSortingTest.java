package student_oleg_kozlov.lesson_11.level_7;

import student_oleg_kozlov.lesson_11.level_3.*;

import java.util.ArrayList;
import java.util.List;

// Task_39, Task_40
class SearchCriteriaPagingSortingTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static BookDatabaseImpl bookDatabase = generateDatabase();

    public static void main(String[] args) {
        findTestNoPagingNoSorting();
        findTestPagingMiddleNoSorting();
        findTestPagingFirstNoSorting();
        findTestPagingLastNoSorting();
        findTestNoPagingSortingAsc();
        findTestNoPagingSortingDesc();
        findTestPagingSortingAsc();
        findTestPagingSortingDesc();
        printFooter();
    }

    private static void findTestNoPagingNoSorting() {
        totalRun++;
        int[] indexes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"));
        checkResult(expected, bookDatabase.find(criteria),"findTestNoPagingNoSorting");
    }

    private static void findTestPagingFirstNoSorting() {
        totalRun++;
        int[] indexes = {0, 1, 2, 3};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(1, 4));
        checkResult(expected, bookDatabase.find(criteria),"findTestPagingFirstNoSorting");
    }

    private static void findTestPagingMiddleNoSorting() {
        totalRun++;
        int[] indexes = {3, 4, 5};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(2, 3));
        checkResult(expected, bookDatabase.find(criteria),"findTestPagingMiddleNoSorting");
    }

    private static void findTestPagingLastNoSorting() {
        totalRun++;
        int[] indexes = {8, 9};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(3, 4));
        checkResult(expected, bookDatabase.find(criteria),"findTestPagingLastNoSorting");
    }

    private static void findTestNoPagingSortingAsc() {
        totalRun++;
        int[] indexes = {3, 2, 4, 1, 7, 0, 6, 9, 5, 8};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(), SortingType.ASC);
        checkResult(expected, bookDatabase.find(criteria),"findTestNoPagingSortingAsc");
    }

    private static void findTestNoPagingSortingDesc() {
        totalRun++;
        int[] indexes = {8, 5, 9, 6, 0, 7, 1, 4, 2, 3};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(), SortingType.DESC);
        checkResult(expected, bookDatabase.find(criteria),"findTestNoPagingSortingDesc");
    }

    private static void findTestPagingSortingAsc() {
        totalRun++;
        int[] indexes = {1, 7, 0};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(2, 3), SortingType.ASC);
        checkResult(expected, bookDatabase.find(criteria),"findTestPagingSortingAsc");
    }

    private static void findTestPagingSortingDesc() {
        totalRun++;
        int[] indexes = {6, 0, 7};
        List<Book> expected = getListElements(bookDatabase.getBooks(), indexes);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2002"), new Paging(2, 3), SortingType.DESC);
        checkResult(expected, bookDatabase.find(criteria),"findTestPagingSortingDesc");
    }

    private static void checkResult(List<Book> expected, List<Book> actual, String testName) {
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

    private static BookDatabaseImpl generateDatabase() {
        BookDatabaseImpl result = new BookDatabaseImpl();
        result.save(new Book("Title6", "Author1", "2001"));
        result.save(new Book("Title4", "Author2", "2001"));
        result.save(new Book("Title2", "Author2", "2002"));
        result.save(new Book("Title1", "Author3", "2001"));
        result.save(new Book("Title3", "Author3", "2002"));
        result.save(new Book("Title9", "Author3", "2002"));
        result.save(new Book("Title7", "Author4", "2001"));
        result.save(new Book("Title5", "Author5", "2001"));
        result.save(new Book("Title90", "Author1", "2001"));
        result.save(new Book("Title8", "Author1", "2002"));
        return result;
    }

    private static List<Book> getListElements(List<Book> list, int... indexes) {
        List<Book> result = new ArrayList<>();
        for (int i : indexes) {
            result.add(list.get(i));
        }
        return result;
    }
}
