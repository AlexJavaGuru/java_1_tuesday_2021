package student_daniel.lesson9.level5;

import java.util.Arrays;
import java.util.Objects;

public class BookTest {
    //Task 13 14 15 16 17 18 19 20 21 22 23 24
    public static void main(String[] args) {
        BookTest myTest = new BookTest();
        myTest.addNewBook();
        myTest.addSingleBook();
        myTest.addMultipleBooks();
        myTest.addWithDuplicate();
        myTest.emptyAuthor();
        myTest.emptyTitle();
        myTest.emptyAuthorAndTitle();
        myTest.spacesAsAuthorAndTitle();
        myTest.deleteSecondEntry();
        myTest.getBooksByAuthor();
        myTest.getBooksByAuthorNone();
        myTest.getBooksByAuthorFirstName();
        myTest.getBooksByTitle();
        myTest.getBooksByTitleNone();
        myTest.getBooksByTitleFirstName();
        myTest.markAsRead();
        myTest.markAsUnread();
        myTest.getListOfReadBooks();
        myTest.getListOfUnreadBooks();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Tests
    void addNewBook() {
        Book testBook = new Book("BookAuthor", "BookTitle");
        BookReaderImpl bookList = new BookReaderImpl();
        boolean actualResult = bookList.addNewBook(testBook);
        check(true, actualResult, "Book is added to the Reader: " + actualResult);
    }

    void addSingleBook() {
        Book testBook = new Book("BookAuthor", "BookTitle");
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(testBook);
        String actualResult = "BookAuthor BookTitle";
        String expectedResult = bookList.myBooks[0].getAuthorName() + " " + bookList.myBooks[0].getTitleName();
        check(expectedResult, actualResult, "Single Book >>> Book is added to the Reader: " + testBook.getAuthorName() + " " + testBook.getTitleName());
    }

    void addMultipleBooks() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1","BookTitle1"));
        bookList.addNewBook(new Book("BookAuthor2","BookTitle2"));
        String expectedResultOne = "BookAuthor1 BookTitle1";
        String expectedResultTwo = "BookAuthor2 BookTitle2";
        String actualResultOne = bookList.myBooks[0].getAuthorName() + " " + bookList.myBooks[0].getTitleName();
        String actualResultTwo = bookList.myBooks[1].getAuthorName() + " " + bookList.myBooks[1].getTitleName();
        check(expectedResultOne, actualResultOne, "Multiple Books >>> First Book is added to the Reader: " + actualResultOne);
        check(expectedResultTwo, actualResultTwo, "Multiple Books >>> Second Book is added to the Reader: " + actualResultTwo);
    }

    void addWithDuplicate() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor","BookTitle"));
        bookList.addNewBook(new Book("BookAuthor","BookTitle"));
        bookList.addNewBook(new Book("BookAuthor","BookTitle"));
        bookList.addNewBook(new Book("BookAuthor2","BookTitle2"));
        String[] expectedResult = {"BookTitle [BookAuthor]", "BookTitle2 [BookAuthor2]"};
        String[] actualResult = bookList.getCurrentBookList();
        check(expectedResult, actualResult, "With Duplicate >>> Multiple Books >>> First and Last Books are added, other skipped as Duplicates: " + Arrays.toString(actualResult));
    }

    void emptyAuthor() {
        Book testBook = new Book("", "BookTitle");
        BookReaderImpl bookList = new BookReaderImpl();
        boolean actualResult = bookList.addNewBook(testBook);
        check(false, actualResult, "Book is not added >>> Empty author: " + actualResult);
    }

    void emptyTitle() {
        Book testBook = new Book("BookAuthor1", "");
        BookReaderImpl bookList = new BookReaderImpl();
        boolean actualResult = bookList.addNewBook(testBook);
        check(false, actualResult, "Book is not added >>> Empty title: " + actualResult);
    }

    void emptyAuthorAndTitle() {
        Book testBook = new Book("", "");
        BookReaderImpl bookList = new BookReaderImpl();
        boolean actualResult = bookList.addNewBook(testBook);
        check(false, actualResult, "Book is not added >>> Empty author and title: " + actualResult);
    }

    void spacesAsAuthorAndTitle() {
        Book testBook = new Book(" ", " ");
        BookReaderImpl bookList = new BookReaderImpl();
        boolean actualResult = bookList.addNewBook(testBook);
        check(false, actualResult, "Book is not added >>> 'Spaces' as author and title: " + actualResult);
    }

    void deleteSecondEntry() {
        BookReaderImpl bookList = new BookReaderImpl();
        Book testBook = new Book("BookAuthor1", "BookTitle1");
        Book testBookTwo = new Book("BookAuthor2", "BookTitle2");
        Book testBookThree = new Book("BookAuthor3", "BookTitle3");
        bookList.addNewBook(testBook);
        bookList.addNewBook(testBookTwo);
        bookList.addNewBook(testBookThree);
        String[] expectedResult = {"BookTitle1 [BookAuthor1]", "BookTitle3 [BookAuthor3]"};
        bookList.deleteBook(testBookTwo);
        String[] actualResult = bookList.getCurrentBookList();
        check(expectedResult, actualResult, "Three Books added >>> One Book deleted >>> Current list: " + Arrays.toString(actualResult));
    }

    void getBooksByAuthor() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1", "BookTitle1"));
        bookList.addNewBook(new Book("Bobba Fet", "BookTitle2"));
        bookList.addNewBook(new Book("Bobba Fet", "BookTitle3"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle2"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle3"));
        String searchAuthor = "Bobba Fet";
        Book[] expectedResult = {new Book("Bobba Fet", "BookTitle2"), new Book("Bobba Fet", "BookTitle3")};
        Book[] actualResult = bookList.getBooksByAuthorName(searchAuthor);
        check(expectedResult, actualResult, "Five Books added >>> Search by author: " + searchAuthor + " >>> Current list: " + Arrays.toString(actualResult));
    }

    void getBooksByAuthorNone() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1", "BookTitle1"));
        bookList.addNewBook(new Book("Tom Cat", "BookTitle2"));
        String searchAuthor = "Tom";
        Book[] expectedResult = {};
        Book[] actualResult = bookList.getBooksByAuthorName(searchAuthor);
        check(expectedResult, actualResult, "Two Books added >>> Search by Unexciting author: " + searchAuthor + " >>> Current list should be empty: " + Arrays.toString(actualResult));
    }

    void getBooksByAuthorFirstName() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1", "BookTitle1"));
        bookList.addNewBook(new Book("John Wick", "BookTitle2"));
        bookList.addNewBook(new Book("John Dick", "BookTitle3"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle2"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle3"));
        String searchAuthor = "John";
        Book[] expectedResult = {new Book("John Wick", "BookTitle2"), new Book( "John Dick", "BookTitle3")};
        Book[] actualResult = bookList.getBooksByAuthorFirstName(searchAuthor);
        check(expectedResult, actualResult, "Five Books added >>> Search by author using it's first word: " + searchAuthor + " >>> Current list: " + Arrays.toString(actualResult));
    }

    void getBooksByTitle() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1", "BookTitle1"));
        bookList.addNewBook(new Book("Bobba Fet", "Star Wars"));
        bookList.addNewBook(new Book("Bobba Fet", "BookTitle3"));
        bookList.addNewBook(new Book("Unknown", "Star Wars"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle3"));
        String searchTitle = "Star Wars";
        Book[] expectedResult = {new Book("Bobba Fet", "Star Wars"), new Book("Unknown", "Star Wars")};
        Book[] actualResult = bookList.getBooksByTitleName(searchTitle);
        check(expectedResult, actualResult, "Five Books added >>> Search by title: " + searchTitle + " >>> Current list: " + Arrays.toString(actualResult));
    }

    void getBooksByTitleNone() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1", "BookTitle1"));
        bookList.addNewBook(new Book("Bobba Fet", "Star Wars"));
        bookList.addNewBook(new Book("Bobba Fet", "BookTitle3"));
        bookList.addNewBook(new Book("Unknown", "Star Wars"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle3"));
        String searchTitle = "Wars Star";
        Book[] expectedResult = {};
        Book[] actualResult = bookList.getBooksByTitleName(searchTitle);
        check(expectedResult, actualResult, "Five Books added >>> Search by title: " + searchTitle + " >>> Current list should be empty: " + Arrays.toString(actualResult));
    }

    void getBooksByTitleFirstName() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1", "BookTitle1"));
        bookList.addNewBook(new Book("Bobba Fet", "Star Wars"));
        bookList.addNewBook(new Book("Bobba Fet", "BookTitle3"));
        bookList.addNewBook(new Book("Unknown", "Star Wars"));
        bookList.addNewBook(new Book("BookAuthor3", "BookTitle3"));
        String searchTitle = "Star";
        Book[] expectedResult = {new Book("Bobba Fet", "Star Wars"), new Book( "Unknown", "Star Wars")};
        Book[] actualResult = bookList.getBooksByTitleFirstName(searchTitle);
        check(expectedResult, actualResult, "Five Books added >>> Search by title using it's first word: " + searchTitle + " >>> Current list: " + Arrays.toString(actualResult));
    }

    void markAsRead() {
        Book testBook = new Book("Daniel", "Monkey Job");
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(testBook);
        bookList.markAsRead(testBook);
        boolean actualResult = bookList.myBooks[0].isRead();
        check(true, actualResult, "Book is added and is marked as read: " + actualResult);
    }

    void markAsUnread() {
        Book testBook = new Book("Daniel", "Monkey Job");
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(testBook);
        bookList.markAsUnread(testBook);
        boolean actualResult = bookList.myBooks[0].isUnread();
        check(true, actualResult, "Book is added and is marked as unread: " + actualResult);
    }

    void getListOfReadBooks() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1","BookTitle1"));
        bookList.addNewBook(new Book("BookAuthor2","BookTitle2"));
        bookList.addNewBook(new Book("BookAuthor3","BookTitle3"));
        bookList.addNewBook(new Book("BookAuthor4","BookTitle4"));
        bookList.markAsRead(new Book("BookAuthor2","BookTitle2"));
        bookList.markAsRead(new Book("BookAuthor3","BookTitle3"));
        String[] expectedResult = {"BookTitle2 [BookAuthor2]", "BookTitle3 [BookAuthor3]"};
        String[] actualResult = bookList.getReadBooksList();
        check(expectedResult, actualResult, "Four books >>> Second and Third books are marked as Read : " + Arrays.toString(actualResult));
    }

    void getListOfUnreadBooks() {
        BookReaderImpl bookList = new BookReaderImpl();
        bookList.addNewBook(new Book("BookAuthor1","BookTitle1"));
        bookList.addNewBook(new Book("BookAuthor2","BookTitle2"));
        bookList.addNewBook(new Book("BookAuthor3","BookTitle3"));
        bookList.addNewBook(new Book("BookAuthor4","BookTitle4"));
        bookList.markAsUnread(new Book("BookAuthor1","BookTitle1"));
        bookList.markAsUnread(new Book("BookAuthor4","BookTitle4"));
        String[] expectedResult = {"BookTitle1 [BookAuthor1]", "BookTitle4 [BookAuthor4]"};
        String[] actualResult = bookList.getUnreadBooksList();
        check(expectedResult, actualResult, "Four books >>> Second and Third books are marked as Unread : " + Arrays.toString(actualResult));
    }

    void check(boolean expectedResult, boolean actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(String expectedResult, String actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(String[] expectedResult, String[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(Book[] expectedResult, Book[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
