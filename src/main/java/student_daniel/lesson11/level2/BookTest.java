package student_daniel.lesson11.level2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookTest {
    //Task 6 7 8 9 10 11 12 13 14
    public static void main(String[] args) {
        BookTest myTest = new BookTest();
        myTest.saveSingleBook();
        myTest.saveSingleBookNull();
        myTest.saveMultipleBooks();
        myTest.deleteSingleBookById();
        myTest.deleteSingleBookByIdWithIncorrectId();
        myTest.deleteSingleBook();
        myTest.deleteMultipleBooks();
        myTest.findBookById();
        myTest.findBookByIdEmpty();
        myTest.findBookByAuthor();
        myTest.findBookByTitle();
        myTest.bookCount();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Tests
    void saveSingleBook() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added Once");
        bookList.save(newBook);
        Long expectedResult = 1L;
        Long actualResult = bookList.allBooks.get(0).getId();
        check(expectedResult, actualResult, "One book is added >>> Return ID one and only book: " + actualResult);
    }

    void saveSingleBookNull() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Long expectedResult = 0L;
        Long actualResult = bookList.save(null);
        check(expectedResult, actualResult, "Null as book >>> Return ID : " + actualResult);
    }

    void saveMultipleBooks() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        bookList.save(newBook);
        bookList.save(newBook2);
        Long expectedResult = 2L;
        Long actualResult = bookList.allBooks.get(1).getId();
//        System.out.println("get " + bookList.allBooks.get(0));
//        System.out.println("get id from " + bookList.allBooks.get(0).getId());
        check(expectedResult, actualResult, "Two books are added >>> Return ID of second book: " + actualResult);
    }

    void deleteSingleBookById() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        bookList.save(newBook);
        bookList.save(newBook2); //removing this book later
        bookList.save(newBook3);
        boolean actualResult = bookList.delete(2L); //only 1L and 3L are left
        check(true, actualResult, "Three books are added >>> One book is deleted >>> Return : " + actualResult);
    }

    void deleteSingleBookByIdWithIncorrectId() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        boolean actualResult = bookList.delete(4L); //4L is invalid id, book will not be found, and will not be deleted
        check(false, actualResult, "Three books are added >>> None are deleted >>> Return : " + actualResult);
    }

    void deleteSingleBook() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        Book newBook4 = new Book("Book 4", "Added 4");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        boolean actualResult = bookList.delete(newBook2);
        check(true, actualResult, "Four books are added >>> Delete Second Book >>> Return : " + actualResult);
    }

    void deleteMultipleBooks() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        Book newBook4 = new Book("Book 4", "Added 4");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        boolean actualResult = bookList.delete(newBook2) && bookList.delete(newBook3);
        check(true, actualResult, "Four books are added >>> Delete Two Books >>> Return : " + actualResult);
    }

    void findBookById() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        Book newBook4 = new Book("Book 4", "Added 4");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        Optional<Book> actualResult = bookList.findById(3L);
        check(true, actualResult.isPresent(), "Four books are added >>> Search book by ID >>> The Book is present : " + actualResult);
    }

    void findBookByIdEmpty() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        Book newBook4 = new Book("Book 4", "Added 4");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        Optional<Book> actualResult = bookList.findById(999L);
        check(false, actualResult.isPresent(), "Four books are added >>> Search book by unexisting ID >>> The Book is not present : " + actualResult);
    }

    void findBookByAuthor() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Tom");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Tom");
        Book newBook4 = new Book("Book 4", "Added 4");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        String authorName = "Tom";
        List<Book> expectedResult = Collections.singletonList(newBook);
        List<Book> actualResult = bookList.findByAuthor(authorName);
        check(expectedResult, actualResult, "Four books are added >>> Search books by Author >>> Return List of books : " + actualResult);
    }

    void findBookByTitle() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Cat", "Tom");
        Book newBook2 = new Book("Cat", "Added 2");
        Book newBook3 = new Book("Book 3", "Tom");
        Book newBook4 = new Book("Book 4", "Added 4");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        String titleName = "Cat";
        List<Book> expectedResult = Collections.singletonList(newBook);
        List<Book> actualResult = bookList.findByAuthor(titleName);
        check(expectedResult, actualResult, "Four books are added >>> Search books by Title >>> Return List of books : " + actualResult);
    }

    void bookCount() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1");
        Book newBook2 = new Book("Book 2", "Added 2");
        Book newBook3 = new Book("Book 3", "Added 3");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        int expectedResult = 3;
        int actualResult = bookList.countAllBooks();
        check(expectedResult, actualResult, "Three books are added >>> Total count  >>> Return : " + actualResult);
    }

    void check(Long expectedResult, Long actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(boolean expectedResult, boolean actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(List<Book> expectedResult, List<Book> actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(int expectedResult, int actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
