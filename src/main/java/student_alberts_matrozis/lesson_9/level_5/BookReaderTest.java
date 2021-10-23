package student_alberts_matrozis.lesson_9.level_5;

import static student_alberts_matrozis.albertsUtils.Utils.check;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest testRunner = new BookReaderTest();
        testRunner.addBookTest();
        testRunner.removeBookTest();
        testRunner.showAllBooksTest();
        testRunner.findBookByAuthorTest();
        testRunner.findBookByTitle();
        testRunner.makeReadedTest();
        testRunner.makeUnReadedTest();
        testRunner.showAllReadedBooksTest();
        testRunner.showAllUnReadedBooksTest();
    }

    public void addBookTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("", "");
        Book book1 = new Book("Good book title", "Very good book author");
        test.addBook(book);
        test.addBook(book1);
        Book[] allBooks = test.showAllBooks();
        check(allBooks.length, 1);
    }

    public void removeBookTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("Good book title", "Very good book author");
        Book book1 = new Book("Good book title 2", "Very good book author 2");
        test.addBook(book);
        test.addBook(book1);
        test.removeBook(book);
        Book[] allBooks = test.showAllBooks();
        check(allBooks.length, 1);
    }

    public void showAllBooksTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("Good book title", "Very good book author");
        test.addBook(book);
        Book[] allBooks = test.showAllBooks();
        check(allBooks[0].equals(book), true);
    }

    public void findBookByAuthorTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("Good book title", "John");
        Book book1 = new Book("Good book title 2", "Carl");
        Book book2 = new Book("Good book title 3", "John");
        test.addBook(book);
        test.addBook(book1);
        test.addBook(book2);
        Book[] findedBooks = test.findBookByAuthor("John");
        check(findedBooks[0].equals(book) && findedBooks[1].equals(book2), true);
    }

    public void findBookByTitle() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("Python programming", "John");
        Book book1 = new Book("JavaScript Programming", "Carl");
        Book book2 = new Book("Java programming", "Benjamin");
        test.addBook(book);
        test.addBook(book1);
        test.addBook(book2);
        Book[] findedBooks = test.findBookByTitle("Java");
        check(findedBooks[0].equals(book1) && findedBooks[1].equals(book2), true);
    }

    public void makeReadedTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("JavaScript for beginners", "Carl");
        test.addBook(book);
        test.makeReaded(book);
        check(book.isReaded(), true);
    }

    public void makeUnReadedTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("JavaScript for beginners", "Carl");
        Book book1 = new Book("Java for beginners", "John");
        test.addBook(book);
        test.addBook(book1);
        test.makeReaded(book);
        test.makeUnReaded(book);
        check(!book.isReaded() && !book1.isReaded(), true);
    }

    public void showAllReadedBooksTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("JavaScript for beginners", "Carl");
        Book book1 = new Book("Java for beginners", "John");
        Book book2 = new Book("Python for beginners", "Sarah");
        test.addBook(book);
        test.addBook(book1);
        test.addBook(book2);
        test.makeReaded(book);
        test.makeReaded(book1);
        Book[] findedBooks = test.showAllReadedBooks();
        check(findedBooks[0].equals(book) && findedBooks[1].equals(book1), true);
    }

    public void showAllUnReadedBooksTest() {
        BookReaderImpl test = new BookReaderImpl();
        Book book = new Book("JavaScript for beginners", "Carl");
        Book book1 = new Book("Java for beginners", "John");
        Book book2 = new Book("Python for beginners", "Sarah");
        test.addBook(book);
        test.addBook(book1);
        test.addBook(book2);
        test.makeReaded(book);
        Book[] findedBooks = test.showAllUnReadedBooks();
        check(findedBooks[0].equals(book1) && findedBooks[1].equals(book2), true);
    }
}
