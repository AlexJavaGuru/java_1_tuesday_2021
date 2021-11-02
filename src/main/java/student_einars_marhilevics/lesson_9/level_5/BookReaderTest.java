package student_einars_marhilevics.lesson_9.level_5;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.addBook();
        bookReaderTest.isDuplicateBook();
        bookReaderTest.fullInfoBook();
        bookReaderTest.fullInfoBookTrue();
        bookReaderTest.removeBook();
        bookReaderTest.markBookAsRead();
        bookReaderTest.markBookAsUnread();
    }

    void addBook() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Vasja", "Superblokbaster");
        boolean result = bookReaderImpl.addBook(book);
        check(result, "Test AddBook");
    }

    void isDuplicateBook() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Vasja", "Superblokbaster");
        bookReaderImpl.addBook(book);
        boolean result = bookReaderImpl.isDuplicateBook(book);
        check(result, "Test Duplicate");
    }

    void fullInfoBook() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("", "Superblokbaster");
        boolean result = bookReaderImpl.fullInfoBook(book);
        check(!result, "Test FullInfo");
    }

    void fullInfoBookTrue() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("VASJA", "Superblokbaster");
        boolean result = bookReaderImpl.fullInfoBook(book);
        check(result, "Test FullInfoTrue");
    }

    void removeBook() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Vasja", "Superblokbaster");
        bookReaderImpl.addBook(book);
        boolean result = bookReaderImpl.removeBook(book);
        check(result, "Test RemoveBook");
    }

    void markBookAsRead() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Vasja", "Superblokbaster");
        bookReaderImpl.addBook(book);
        boolean result = bookReaderImpl.markBookAsRead(book);
        check(result, "Test MarkBookRead");
    }

    void markBookAsUnread() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book = new Book("Vasja", "Superblokbaster");
        bookReaderImpl.addBook(book);
        boolean result = bookReaderImpl.markBookAsUnread(book);
        check(result, "Test MarkBookUnread");
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
