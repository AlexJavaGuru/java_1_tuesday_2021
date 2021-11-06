package student_oleg_kozlov.lesson_11.level_3;

import java.util.*;

// Task_23, Task_24, Task_25, Task_26, Task_28, Task_29
class BookDatabaseTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static BookDatabaseImpl bookDatabase = generateDatabase();

    public static void main(String[] args) {
        findUniqueAuthorsTest();
        findUniqueTitlesTest();
        findUniqueBooksTest();
        containsTestSuccess();
        containsTestFail();
        getAuthorToBooksMapTest();
        getEachAuthorBookCountTest();
        printFooter();
    }

    private static void findUniqueAuthorsTest() {
        totalRun++;
        Set<String> expected = new HashSet<>();
        expected.add("Author1");
        expected.add("Author2");
        expected.add("Author3");
        expected.add("Author4");
        expected.add("Author5");
        checkResult(expected, bookDatabase.findUniqueAuthors(), "findUniqueAuthorsTest");
    }

    private static void findUniqueTitlesTest() {
        totalRun++;
        Set<String> expected = new HashSet<>();
        expected.add("Title1");
        expected.add("Title2");
        expected.add("Title3");
        expected.add("Title4");
        expected.add("Title5");
        expected.add("Title6");
        checkResult(expected, bookDatabase.findUniqueTitles(), "findUniqueTitlesTest");
    }

    private static void findUniqueBooksTest() {
        totalRun++;
        Set<Book> expected = getListElementsToSet(bookDatabase.getBooks(), 0, 1, 3, 4, 6, 7, 8, 9);
        checkResultBooks(expected, bookDatabase.findUniqueBooks(), "findUniqueBooksTest");
    }

    private static void containsTestSuccess() {
        totalRun++;
        Book bookToCheck = new Book("Title3", "Author3", "2002");
        checkResult(bookDatabase.contains(bookToCheck), "containsTestSuccess");
    }

    private static void containsTestFail() {
        totalRun++;
        Book bookToCheck = new Book("Title3", "Author3", "2006");
        checkResult(!bookDatabase.contains(bookToCheck), "containsTestFail");
    }

    private static void getAuthorToBooksMapTest() {
        totalRun++;
        Map<String, List<Book>> expected = new HashMap<>();
        expected.put("Author1", getListElementsToList(bookDatabase.getBooks(), 0, 8, 9));
        expected.put("Author2", getListElementsToList(bookDatabase.getBooks(), 1, 2));
        expected.put("Author3", getListElementsToList(bookDatabase.getBooks(), 3, 4, 5));
        expected.put("Author4", getListElementsToList(bookDatabase.getBooks(), 6));
        expected.put("Author5", getListElementsToList(bookDatabase.getBooks(), 7));
        checkResult(expected, bookDatabase.getAuthorToBooksMap(), "getAuthorToBooksMapTest");
    }

    private static void getEachAuthorBookCountTest() {
        totalRun++;
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Author1", 3);
        expected.put("Author2", 1);
        expected.put("Author3", 2);
        expected.put("Author4", 1);
        expected.put("Author5", 1);
        checkResultBookCount(expected, bookDatabase.getEachAuthorBookCount(), "getEachAuthorBookCountTest");
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

    private static void checkResultBooks(Set<Book> expected, Set<Book> actual, String testName) {
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

    private static void checkResult(Map<String, List<Book>> expected, Map<String, List<Book>> actual, String testName) {
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

    private static void checkResultBookCount(Map<String, Integer> expected, Map<String, Integer> actual, String testName) {
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
        result.save(new Book("Title2", "Author2", "2001"));
        result.save(new Book("Title3", "Author3", "2001"));
        result.save(new Book("Title3", "Author3", "2002"));
        result.save(new Book("Title3", "Author3", "2002"));
        result.save(new Book("Title4", "Author4", "2001"));
        result.save(new Book("Title5", "Author5", "2001"));
        result.save(new Book("Title6", "Author1", "2001"));
        result.save(new Book("Title1", "Author1", "2002"));
        return result;
    }

    private static Set<Book> getListElementsToSet(List<Book> list, int... indexes) {
        Set<Book> result = new HashSet<>();
        for (int i : indexes) {
            result.add(list.get(i));
        }
        return result;
    }

    private static List<Book> getListElementsToList(List<Book> list, int... indexes) {
        List<Book> result = new ArrayList<>();
        for (int i : indexes) {
            result.add(list.get(i));
        }
        return result;
    }

}
