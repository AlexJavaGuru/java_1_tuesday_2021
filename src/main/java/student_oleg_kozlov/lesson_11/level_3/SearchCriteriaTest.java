package student_oleg_kozlov.lesson_11.level_3;

import java.util.ArrayList;
import java.util.List;

// Task_16, Task_17, Task_18, Task_19, Task_20, Task_22
class SearchCriteriaTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static BookDatabaseImpl bookDatabase = generateDatabase();

    public static void main(String[] args) {
        authorSearchCriteriaTestSuccess();
        authorSearchCriteriaTestFail();
        authorSearchCriteriaTestNull();

        titleSearchCriteriaTestSuccess();
        titleSearchCriteriaTestFail();
        titleSearchCriteriaTestNull();

        yearOfIssueSearchCriteriaTestSuccess();
        yearOfIssueSearchCriteriaTestFail();
        yearOfIssueSearchCriteriaTestNull();

        andSearchCriteriaTestAuthorTitleSuccess();
        andSearchCriteriaTestAuthorTitleFail();
        andSearchCriteriaTestAuthorYearOfIssueSuccess();
        andSearchCriteriaTestAuthorYearOfIssueFail();
        andSearchCriteriaTestTitleYearOfIssueSuccess();
        andSearchCriteriaTestTitleYearOfIssueFail();
        andSearchCriteriaTestNull();

        orSearchCriteriaTestAuthorTitleSuccess();
        orSearchCriteriaTestAuthorTitleFail();
        orSearchCriteriaTestAuthorYearOfIssueSuccess();
        orSearchCriteriaTestAuthorYearOfIssueFail();
        orSearchCriteriaTestTitleYearOfIssueSuccess();
        orSearchCriteriaTestTitleYearOfIssueFail();
        orSearchCriteriaTestNull();

        findTestAuthorAndTitle();
        findTestAuthorAndTitleAndYear();
        findTestAuthorAndTitleAndYearOrYear();
        findTestAuthorOrAuthorOrAuthorOrAuthor();

        printFooter();
    }

    private static void authorSearchCriteriaTestSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Author2");
        checkResult(criteria.match(bookToSearch), "authorSearchCriteriaTestSuccess");
    }

    private static void authorSearchCriteriaTestFail() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Author1");
        checkResult(!criteria.match(bookToSearch), "authorSearchCriteriaTestFail");
    }

    private static void authorSearchCriteriaTestNull() {
        totalRun++;
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Author1");
        checkResult(!criteria.match(null), "authorSearchCriteriaTestNull");
    }

    private static void titleSearchCriteriaTestSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        TitleSearchCriteria criteria = new TitleSearchCriteria("Title2");
        checkResult(criteria.match(bookToSearch), "titleSearchCriteriaTestSuccess");
    }

    private static void titleSearchCriteriaTestFail() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        TitleSearchCriteria criteria = new TitleSearchCriteria("Title1");
        checkResult(!criteria.match(bookToSearch), "titleSearchCriteriaTestFail");
    }

    private static void titleSearchCriteriaTestNull() {
        totalRun++;
        TitleSearchCriteria criteria = new TitleSearchCriteria("Title1");
        checkResult(!criteria.match(null), "titleSearchCriteriaTestNull");
    }

    private static void yearOfIssueSearchCriteriaTestSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("2000");
        checkResult(criteria.match(bookToSearch), "yearOfIssueSearchCriteriaTestSuccess");
    }

    private static void yearOfIssueSearchCriteriaTestFail() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("2001");
        checkResult(!criteria.match(bookToSearch), "yearOfIssueSearchCriteriaTestFail");
    }

    private static void yearOfIssueSearchCriteriaTestNull() {
        totalRun++;
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("2000");
        checkResult(!criteria.match(null), "yearOfIssueSearchCriteriaTestNull");
    }

    private static void andSearchCriteriaTestAuthorTitleSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new TitleSearchCriteria("Title2"));
        checkResult(criteria.match(bookToSearch), "andSearchCriteriaTestAuthorTitleSuccess");
    }

    private static void andSearchCriteriaTestAuthorTitleFail() {
        totalRun++;
        Book bookToSearch = new Book("Title1", "Author2", "2000");
        bookToSearch.setId(2L);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new TitleSearchCriteria("Title2"));
        checkResult(!criteria.match(bookToSearch), "andSearchCriteriaTestAuthorTitleFail");
    }

    private static void andSearchCriteriaTestAuthorYearOfIssueSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new YearOfIssueSearchCriteria("2000"));
        checkResult(criteria.match(bookToSearch), "andSearchCriteriaTestAuthorYearOfIssueSuccess");
    }

    private static void andSearchCriteriaTestAuthorYearOfIssueFail() {
        totalRun++;
        Book bookToSearch = new Book("Title1", "Author2", "2000");
        bookToSearch.setId(2L);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(!criteria.match(bookToSearch), "andSearchCriteriaTestAuthorYearOfIssueFail");
    }

    private static void andSearchCriteriaTestTitleYearOfIssueSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new TitleSearchCriteria("Title2"),
                new YearOfIssueSearchCriteria("2000"));
        checkResult(criteria.match(bookToSearch), "andSearchCriteriaTestTitleYearOfIssueSuccess");
    }

    private static void andSearchCriteriaTestTitleYearOfIssueFail() {
        totalRun++;
        Book bookToSearch = new Book("Title1", "Author2", "2000");
        bookToSearch.setId(2L);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new TitleSearchCriteria("Title1"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(!criteria.match(bookToSearch), "andSearchCriteriaTestTitleYearOfIssueFail");
    }

    private static void andSearchCriteriaTestNull() {
        totalRun++;
        AndSearchCriteria criteria = new AndSearchCriteria(
                new TitleSearchCriteria("Title1"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(!criteria.match(null), "andSearchCriteriaTestNull");
    }

    private static void orSearchCriteriaTestAuthorTitleSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new TitleSearchCriteria("Title1"));
        checkResult(criteria.match(bookToSearch), "orSearchCriteriaTestAuthorTitleSuccess");
    }

    private static void orSearchCriteriaTestAuthorTitleFail() {
        totalRun++;
        Book bookToSearch = new Book("Title1", "Author2", "2000");
        bookToSearch.setId(2L);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new AuthorSearchCriteria("Author1"),
                new TitleSearchCriteria("Title2"));
        checkResult(!criteria.match(bookToSearch), "orSearchCriteriaTestAuthorTitleFail");
    }

    private static void orSearchCriteriaTestAuthorYearOfIssueSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(criteria.match(bookToSearch), "orSearchCriteriaTestAuthorYearOfIssueSuccess");
    }

    private static void orSearchCriteriaTestAuthorYearOfIssueFail() {
        totalRun++;
        Book bookToSearch = new Book("Title1", "Author2", "2000");
        bookToSearch.setId(2L);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new AuthorSearchCriteria("Author1"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(!criteria.match(bookToSearch), "orSearchCriteriaTestAuthorYearOfIssueFail");
    }

    private static void orSearchCriteriaTestTitleYearOfIssueSuccess() {
        totalRun++;
        Book bookToSearch = new Book("Title2", "Author2", "2000");
        bookToSearch.setId(2L);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new TitleSearchCriteria("Title1"),
                new YearOfIssueSearchCriteria("2000"));
        checkResult(criteria.match(bookToSearch), "orSearchCriteriaTestTitleYearOfIssueSuccess");
    }

    private static void orSearchCriteriaTestTitleYearOfIssueFail() {
        totalRun++;
        Book bookToSearch = new Book("Title1", "Author2", "2000");
        bookToSearch.setId(2L);
        OrSearchCriteria criteria = new OrSearchCriteria(
                new TitleSearchCriteria("Title2"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(!criteria.match(bookToSearch), "orSearchCriteriaTestTitleYearOfIssueFail");
    }

    private static void orSearchCriteriaTestNull() {
        totalRun++;
        OrSearchCriteria criteria = new OrSearchCriteria(
                new TitleSearchCriteria("Title1"),
                new YearOfIssueSearchCriteria("2001"));
        checkResult(!criteria.match(null), "orSearchCriteriaTestNull");
    }

    private static void findTestAuthorAndTitle() {
        totalRun++;
        List<Book> expected = getListElements(bookDatabase.getBooks(), 0, 9);
        AndSearchCriteria criteria = new AndSearchCriteria(
                new TitleSearchCriteria("Title1"),
                new AuthorSearchCriteria("Author1"));
        checkResult(expected, bookDatabase.find(criteria),"findTestAuthorAndTitle");
    }

    private static void findTestAuthorAndTitleAndYear() {
        totalRun++;
        List<Book> expected = getListElements(bookDatabase.getBooks(), 1);
        AndSearchCriteria criteriaBlock = new AndSearchCriteria(
                new TitleSearchCriteria("Title2"),
                new AuthorSearchCriteria("Author2"));
        AndSearchCriteria criteria = new AndSearchCriteria(
                criteriaBlock,
                new YearOfIssueSearchCriteria("2001"));
        checkResult(expected, bookDatabase.find(criteria),"findTestAuthorAndTitleAndYear");
    }

    private static void findTestAuthorAndTitleAndYearOrYear() {
        totalRun++;
        List<Book> expected = getListElements(bookDatabase.getBooks(), 3, 5);
        AndSearchCriteria criteriaLeft = new AndSearchCriteria(
                new TitleSearchCriteria("Title3"),
                new AuthorSearchCriteria("Author3"));
        OrSearchCriteria criteriaRight = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2001"),
                new YearOfIssueSearchCriteria("2003"));
        AndSearchCriteria criteria = new AndSearchCriteria(criteriaLeft, criteriaRight);
        checkResult(expected, bookDatabase.find(criteria),"findTestAuthorAndTitleAndYearOrYear");
    }

    private static void findTestAuthorOrAuthorOrAuthorOrAuthor() {
        totalRun++;
        List<Book> expected = getListElements(bookDatabase.getBooks(), 6, 7);
        OrSearchCriteria criteriaLeft = new OrSearchCriteria(
                new AuthorSearchCriteria("Author9"),
                new AuthorSearchCriteria("Author4"));
        OrSearchCriteria criteriaRight = new OrSearchCriteria(
                new AuthorSearchCriteria("Author0"),
                new AuthorSearchCriteria("Author5"));
        OrSearchCriteria criteria = new OrSearchCriteria(criteriaLeft, criteriaRight);
        checkResult(expected, bookDatabase.find(criteria),"findTestAuthorOrAuthorOrAuthorOrAuthor");
    }

    private static void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + !result);
            System.out.println("Actual:   " + result + TEXT_RESET);
            totalFailed++;
        }
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
        result.save(new Book("Title1", "Author1", "2001"));
        result.save(new Book("Title2", "Author2", "2001"));
        result.save(new Book("Title2", "Author2", "2002"));
        result.save(new Book("Title3", "Author3", "2001"));
        result.save(new Book("Title3", "Author3", "2002"));
        result.save(new Book("Title3", "Author3", "2003"));
        result.save(new Book("Title4", "Author4", "2001"));
        result.save(new Book("Title5", "Author5", "2001"));
        result.save(new Book("Title6", "Author1", "2001"));
        result.save(new Book("Title1", "Author1", "2002"));
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
