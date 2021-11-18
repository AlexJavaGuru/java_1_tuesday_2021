package student_julija_kuzmicova.lesson_9.level_5;

import java.util.Arrays;

//Task_13, Task_14, Task_15, Task_16, Task_17, Task_18, Task_19, Task_20, Task_21, Task_22, Task_23, Task_24
class BookReaderTest {

    BookReaderImpl bookReader = new BookReaderImpl();
    Book bookOne = new Book("TitleOne", "AuthorOne");
    Book bookTwo = new Book("TitleTwo", "AuthorTwo");
    Book bookThree = new Book("TitleTwo", "AuthorTwo");
    Book bookFour = new Book("TitleFour", "");
    Book bookFive = new Book("TitleFive", "AuthorOne");
    Book bookSix = new Book("TitleTwo", "AuthorOne");
    Book bookSeven = new Book("TitleTwo", "AuthorSeven");

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.isBookAddedReturnTrueTest();
        test.isBookAddedArrayTest();
        test.isBookAddedReturnFalseTest();
        test.isBookValidTest();
        test.isBookDuplicate();
        test.isBookDeletedBooleanTest();
        test.isBookDeletedArrayTest();
        test.booksListTest();
        test.searchByAuthorByWordTest();
        test.searchByAuthorByLetterTest();
        test.searchByTitleByWordTest();
        test.searchByTitleByLetterTest();
        test.markBookAsReadReturnTrueTest();
        test.markBookAsReadReturnFalseTest();
        test.markBookAsUnreadReturnTrueTest();
        test.markBookAsUnreadReturnFalseTest();
        test.readBooksListTest();
        test.unreadBooksListTest();

    }

    void isBookAddedReturnTrueTest() {
        checkResult(true, bookReader.isBookAdded(bookOne), "isBookAddedReturnsTrueTest");
    }

    void isBookAddedReturnFalseTest() {
        checkResult(false, bookReader.isBookAdded(bookFour), "isBookAddedReturnsFalseTest");
    }

    void isBookAddedArrayTest() {
        bookReader.isBookAdded(bookTwo);
        bookReader.isBookAdded(bookThree);
        Book[] expectedResult = {bookOne, bookTwo};
        checkResult(expectedResult, bookReader.books, "isBookAddedArrayTest");
    }

    void isBookValidTest() {
        checkResult(false, bookReader.isBookAdded(bookFour), "isBookValidTest");
    }

    void isBookDuplicate() {
        checkResult(true, bookReader.isBookDuplicate(bookThree), "isBookDuplicate");
    }

    void isBookDeletedBooleanTest() {
        checkResult(true, bookReader.isBookDeleted(bookTwo), "isBookDeletedBooleanTest");
    }

    void isBookDeletedArrayTest() {
        bookReader.isBookAdded(bookTwo);
        bookReader.isBookDeleted(bookTwo);
        Book[] expectedResult = {bookOne};
        checkResult(expectedResult, bookReader.books, "isBookDeletedArrayTest");
    }

    void booksListTest() {
        bookReader.isBookAdded(bookTwo);
        String[] expectedResult = {"TitleOne [AuthorOne]", "TitleTwo [AuthorTwo]"};
        checkResult(expectedResult, bookReader.booksList(), "booksListTest");
    }

    void searchByAuthorByWordTest() {
        bookReader.isBookAdded(bookFive);
        bookReader.isBookAdded(bookSix);
        bookReader.isBookAdded(bookSeven);
        String author = "AuthorOne";
        Book[] expectedResult = {bookOne, bookFive, bookSix};
        checkResult(expectedResult, bookReader.searchByAuthor(author), "searchByAuthorByWordTest");
    }

    void searchByAuthorByLetterTest() {
        String author = "Auth";
        Book[] expectedResult = {bookOne, bookTwo, bookFive, bookSix, bookSeven};
        checkResult(expectedResult, bookReader.searchByAuthor(author), "searchByAuthorByLetterTest");
    }

    void searchByTitleByWordTest() {
        String title = "TitleTwo";
        Book[] expectedResult = {bookTwo, bookSix, bookSeven};
        checkResult(expectedResult, bookReader.searchByTitle(title), "searchByTitleByWordTest");
    }

    void searchByTitleByLetterTest() {
        String title = "Title";
        Book[] expectedResult = {bookOne, bookTwo, bookFive, bookSix, bookSeven};
        checkResult(expectedResult, bookReader.searchByTitle(title), "searchByTitleByLetterTest");
    }

    void markBookAsReadReturnTrueTest() {
        checkResult(true, bookReader.markBookAsRead(bookOne), "markBookAsReadReturnTrueTest");
    }

    void markBookAsReadReturnFalseTest() {
        checkResult(false, bookReader.markBookAsRead(bookThree), "markBookAsReadReturnFalseTest");
    }

    void markBookAsUnreadReturnTrueTest() {
        checkResult(true, bookReader.markBookAsUnread(bookOne), "markBookAsUnreadReturnTrueTest");
    }

    void markBookAsUnreadReturnFalseTest() {
        checkResult(false, bookReader.markBookAsRead(bookThree), "markBookAsUnreadReturnFalseTest");
    }

    void readBooksListTest() {
        bookReader.markBookAsRead(bookTwo);
        bookReader.markBookAsRead(bookFive);
        bookReader.markBookAsRead(bookSeven);
        String[] expectedResult = {"TitleTwo [AuthorTwo]", "TitleFive [AuthorOne]", "TitleTwo [AuthorSeven]"};
        checkResult(expectedResult, bookReader.readBooksList(), "readBooksListTest");
    }

    void unreadBooksListTest() {
        bookReader.markBookAsUnread(bookSeven);
        String[] expectedResult = {"TitleOne [AuthorOne]", "TitleTwo [AuthorOne]", "TitleTwo [AuthorSeven]"};
        checkResult(expectedResult, bookReader.unreadBooksList(), "unreadBooksListTest");
    }

    void checkResult(Book expectedResult, Book actualResult, String testName){
        if(expectedResult == null && actualResult == null) {
            System.out.println(testName + " has passed");
        } else if (expectedResult.equals(actualResult)) {
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
            System.out.println(testName + "Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(Book[] expectedResult, Book[] actualResult, String testName){
        if(arraysAreEqual(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + Arrays.toString(expectedResult) + " but actual: " + Arrays.toString(actualResult));
        }
    }

    boolean arraysAreEqual(Book[] arrayOne, Book[] arrayTwo) {
        if(arrayOne.length != arrayTwo.length) {
            return false;
        }
        for(int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }

    void checkResult(String[] expectedResult, String[] actualResult, String testName){
        if(arraysAreEqual(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + Arrays.toString(expectedResult) + " but actual: " + Arrays.toString(actualResult));
        }
    }

    boolean arraysAreEqual(String[] arrayOne, String[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (!arrayOne[i].equals(arrayTwo[i])) {
                return false;
            }
        }
        return true;
    }
}
