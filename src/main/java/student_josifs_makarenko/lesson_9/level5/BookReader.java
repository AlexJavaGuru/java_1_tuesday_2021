package student_josifs_makarenko.lesson_9.level5;

public interface BookReader {
    boolean addBookToLibrary (Book book);
    boolean deleteBookFromLibrary(Book book);
    void showLibrary();
    Book[] findByAuthor(String author);
    Book[] findByName(String name);
    boolean markAsRead(Book book);
    boolean markAsUnread(Book book);
    void showReadBook();
    void showUnreadBook();
}
