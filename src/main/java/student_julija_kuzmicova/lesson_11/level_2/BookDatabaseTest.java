package student_julija_kuzmicova.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Task_6, Task_7, Task_8, Task_9, Task_10, Task_11, Task_12, Task_13, Task_14
class BookDatabaseTest {

    BookDatabaseImpl database = new BookDatabaseImpl();
    private List<Book> bookList = new ArrayList<>();
    Book book1 = new Book("Author1", "Title1");
    Book book2 = new Book("Author2", "Title2");
    Book book3 = new Book("Author3", "Title3");
    Book book4 = new Book("Author1", "Title2");

    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.saveBookTest();
        test.deleteByIdReturnTrueTest();
        test.deleteByIdReturnFalseTest();
        test.deleteByBookReturnTrueTest();
        test.deleteByBookReturnFalseTest();
        test.findByIdReturnNullTest();
        test.findByIdReturnBookTest();
        test.findByAuthorTest();
        test.findByTitleTest();
        test.countAllBooksTest();
        test.deleteByAuthorTest();
        test.deleteByTitleTest();
    }

    void saveBookTest() {
        checkResult(1L, database.save(book1), "saveBookTest");
    }

    void deleteByIdReturnTrueTest() {
        database.save(book2);
        database.save(book3);
        checkResult(true, database.delete(2L), "deleteByIdReturnTrueTest");
    }

    void deleteByIdReturnFalseTest() {
        checkResult(false, database.delete(2L), "deleteByIdReturnFalseTest");
    }

    void deleteByBookReturnTrueTest() {
        database.save(book2);
        checkResult(true, database.delete(book3), "deleteByBookReturnTrueTest");
    }

    void deleteByBookReturnFalseTest() {
        checkResult(false, database.delete(book3), "deleteByBookReturnFalseTest");
    }

    void findByIdReturnNullTest() {
        Optional<Book> actualResult = database.findById(3L);
        checkResult(false, actualResult.isPresent(), "findByIdReturnNullTest");
    }

    void findByIdReturnBookTest() {
        Optional<Book> actualResult = database.findById(1L);
        checkResult(book1, actualResult.get(), "findByIdReturnBookTest");
    }

    void findByAuthorTest() {
        database.save(book4);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book4);
        checkResult(expectedResult, database.findByAuthor("Author1"), "findByAuthorTest");
    }

    void findByTitleTest() {
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        expectedResult.add(book4);
        checkResult(expectedResult, database.findByTitle("Title2"), "findByTitleTest");
    }

    void countAllBooksTest() {
        checkResult(3, database.countAllBooks(), "countAllBooksTest");
    }

    void deleteByAuthorTest() {
        database.save(book3);
        database.deleteByAuthor("Author3");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book4);
        checkResult(expectedResult, database.getBookList(), "deleteByAuthorTest");
    }

    void deleteByTitleTest() {
        database.save(book3);
        database.deleteByTitle("Title2");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        checkResult(expectedResult, database.getBookList(), "deleteByTitleTest");
    }

    void checkResult(Long expectedResult, Long actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(Book expectedResult, Book actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(List<Book> expectedResult, List<Book> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
