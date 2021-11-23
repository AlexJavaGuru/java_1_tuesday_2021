package student_alberts_matrozis.lesson_9.level_5;

public interface BookReader {
    boolean addBook(Book book);
    boolean removeBook(Book book);
    Book[] showAllBooks();
    Book[] findBookByAuthor(String author);
    Book[] findBookByTitle(String title);
    boolean makeReaded(Book book);
    boolean makeUnReaded(Book book);
    Book[] showAllReadedBooks();
    Book[] showAllUnReadedBooks();
}
