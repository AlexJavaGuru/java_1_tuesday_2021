package student_oleg_kozlov.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Task_6, Task_7, Task_8, Task_9, Task_10, Task_11, Task_12, Task_13, Task_14
class BookDatabaseTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        shouldAddNewBookTest();
        shouldDeleteBookByIdTestExistingId();
        shouldDeleteBookByIdTestWrongId();
        shouldDeleteBookByObjectTestExistingObject();
        shouldDeleteBookByObjectTestWrongObject();
        shouldFindBookByIdTest();
        shouldFindBookByAuthorTest();
        shouldFindBookByTitleTest();
        shouldCountAllBooksQuantityTest();
        shouldDeleteAllBooksByAuthorTest();
        shouldDeleteAllBooksByTitleTest();
        printFooter();
    }

    private static void shouldAddNewBookTest() {
        totalRun++;
        Book book1 = new Book("Author1", "Title1");
        book1.setId(1L);
        Book book2 = new Book("Author2", "Title2");
        book2.setId(2L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        checkResult(expected,  bookDatabase.getBooks(),"shouldAddNewBookTest");
    }

    private static void shouldDeleteBookByIdTestExistingId() {
        totalRun++;
        Book book1 = new Book("Author1", "Title1");
        book1.setId(1L);
        Book book2 = new Book("Author3", "Title3");
        book2.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        boolean result = bookDatabase.delete(2L);
        checkResult(true, result, expected,  bookDatabase.getBooks(),"shouldDeleteBookByIdTestExistingId");
    }

    private static void shouldDeleteBookByIdTestWrongId() {
        totalRun++;
        Book book1 = new Book("Author1", "Title1");
        book1.setId(1L);
        Book book2 = new Book("Author2", "Title2");
        book2.setId(2L);
        Book book3 = new Book("Author3", "Title3");
        book3.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        boolean result = bookDatabase.delete(4L);
        checkResult(false, result, expected,  bookDatabase.getBooks(),"shouldDeleteBookByIdTestWrongId");
    }

    private static void shouldDeleteBookByObjectTestExistingObject() {
        totalRun++;
        Book book1 = new Book("Author1", "Title1");
        book1.setId(1L);
        Book book2 = new Book("Author3", "Title3");
        book2.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        Book bookToDelete = new Book("Author2", "Title2");
        bookToDelete.setId(2L);
        boolean result = bookDatabase.delete(bookToDelete);
        checkResult(true, result, expected,  bookDatabase.getBooks(),"shouldDeleteBookByObjectTestExistingObject");
    }

    private static void shouldDeleteBookByObjectTestWrongObject() {
        totalRun++;
        Book book1 = new Book("Author1", "Title1");
        book1.setId(1L);
        Book book2 = new Book("Author2", "Title2");
        book2.setId(2L);
        Book book3 = new Book("Author3", "Title3");
        book3.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        Book bookToDelete = new Book("Author", "Title");
        bookToDelete.setId(4L);
        boolean result = bookDatabase.delete(bookToDelete);
        checkResult(false, result, expected,  bookDatabase.getBooks(),"shouldDeleteBookByObjectTestWrongObject");
    }

    private static void shouldFindBookByIdTest() {
        totalRun++;
        Book expected = new Book("Author2", "Title2");
        expected.setId(2L);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        Optional<Book> result = bookDatabase.findById(2L);
        checkResult(expected, (result.isPresent()) ? result.get() : new Book("", ""),"shouldFindBookByIdTest");
    }

    private static void shouldFindBookByAuthorTest() {
        totalRun++;
        Book book1 = new Book("Author2", "Title2");
        book1.setId(2L);
        Book book2 = new Book("Author2", "Title22");
        book2.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author2", "Title22"));
        bookDatabase.save(new Book("Author3", "Title3"));
        checkResult(expected,  bookDatabase.findByAuthor("Author2"),"shouldFindBookByAuthorTest");
    }

    private static void shouldFindBookByTitleTest() {
        totalRun++;
        Book book1 = new Book("Author2", "Title2");
        book1.setId(2L);
        Book book2 = new Book("Author3", "Title2");
        book2.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        checkResult(expected,  bookDatabase.findByTitle("Title2"),"shouldFindBookByTitleTest");
    }

    private static void shouldCountAllBooksQuantityTest() {
        totalRun++;
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        bookDatabase.save(new Book("Author4", "Title4"));
        checkResult(4,  bookDatabase.countAllBooks(),"shouldCountAllBooksQuantityTest");
    }

    private static void shouldDeleteAllBooksByAuthorTest() {
        totalRun++;
        Book book1 = new Book("Author2", "Title2");
        book1.setId(2L);
        Book book2 = new Book("Author3", "Title2");
        book2.setId(3L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title2"));
        bookDatabase.save(new Book("Author1", "Title3"));
        bookDatabase.deleteByAuthor("Author1");
        checkResult(expected,  bookDatabase.getBooks(),"shouldDeleteAllBooksByAuthorTest");
    }

    private static void shouldDeleteAllBooksByTitleTest() {
        totalRun++;
        Book book1 = new Book("Author1", "Title1");
        book1.setId(1L);
        Book book2 = new Book("Author1", "Title3");
        book2.setId(4L);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title2"));
        bookDatabase.save(new Book("Author1", "Title3"));
        bookDatabase.deleteByTitle("Title2");
        checkResult(expected,  bookDatabase.getBooks(),"shouldDeleteAllBooksByTitleTest");
    }

    private static void checkResult(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void checkResult(Book expected, Book actual, String testName) {
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

    private static void checkResult(boolean expectedResult, boolean actualResult, List<Book> expected, List<Book> actual, String testName) {
        if (expected.equals(actual) && expectedResult == actualResult) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
            System.out.println("Expected values: " + expected);
            System.out.println("Actual values:   " + actual + TEXT_RESET);
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
