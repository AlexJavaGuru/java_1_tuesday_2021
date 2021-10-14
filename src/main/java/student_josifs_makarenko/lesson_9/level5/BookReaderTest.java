package student_josifs_makarenko.lesson_9.level5;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.addBookToLibraryTestIfTrue();
        bookReaderTest.addBookToLibraryTestIfFalse1();
        bookReaderTest.addBookToLibraryTestIfFalse2();
        bookReaderTest.deleteBookTrue();
        bookReaderTest.deleteBookFalse();
        bookReaderTest.findByAuthorTest();
        bookReaderTest.findByNameTest();
        bookReaderTest.markAsReadTestTrue();
        bookReaderTest.markAsReadTestFalse();
        bookReaderTest.markAsUnreadTestTrue();
        bookReaderTest.markAsUnreadTestFalse();
    }

    void addBookToLibraryTestIfTrue () {
        BookReader bookReader = new BookReaderImpl();
        check(bookReader.addBookToLibrary(new Book("Gette", "Faust")), "AddTest(True)");
    }

    void addBookToLibraryTestIfFalse1 () {
        BookReader bookReader = new BookReaderImpl();
        check(!bookReader.addBookToLibrary(new Book(null, null)), "AddTest(False)");
    }

    void addBookToLibraryTestIfFalse2 () {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Lem", "Edam");
        bookReader.addBookToLibrary(book);
        check(!bookReader.addBookToLibrary(book), "AddTest(False)");
    }


    void deleteBookTrue () {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Lem", "Edam");
        bookReader.addBookToLibrary(book);
        check(bookReader.deleteBookFromLibrary(book), "DeleteTest(True)");
    }

    void deleteBookFalse () {
        BookReader bookReader = new BookReaderImpl();
        check(!bookReader.deleteBookFromLibrary(new Book(null, null)), "DeleteTest(False)");
    }

    void findByAuthorTest () {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lem", "Edam");
        Book book2 = new Book("Zhul Vern", "vokrug sveta za 80 dney");
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        Book[] realResult = bookReader.findByAuthor("Zhul");
        Book[] expectedResult = new Book[1];
        expectedResult[0] = book2;
        check(checkArrays(expectedResult, realResult), "findByAuthorTest");
    }

    void findByNameTest () {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lem", "Edam");
        Book book2 = new Book("Zhul Vern", "vokrug sveta za 80 dney");
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        Book[] expectedResult = {book2};
        check(checkArrays(expectedResult, bookReader.findByName("vokrug")), "findByNameTest");
    }

    void markAsReadTestTrue() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lem", "Edam");
        bookReader.addBookToLibrary(book1);
        check(bookReader.markAsRead(book1), "markAsReadTestTrue");
    }

    void markAsReadTestFalse() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lem", "Edam");
        Book book = new Book(null, "Busido");
        bookReader.addBookToLibrary(book1);
        check(!bookReader.markAsRead(book), "markAsReadTestFalse");
    }

    void markAsUnreadTestTrue() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lem", "Edam");
        bookReader.addBookToLibrary(book1);
        check(bookReader.markAsUnread(book1), "markAsUnreadTestTrue");
    }

    void markAsUnreadTestFalse() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lem", "Edam");
        Book book = new Book(null, "Busido");
        bookReader.addBookToLibrary(book1);
        check(!bookReader.markAsUnread(book), "markAsUnreadTestFalse");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }

    static boolean checkArrays (Book[] firstArray, Book[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
