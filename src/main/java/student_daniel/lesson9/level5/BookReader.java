package student_daniel.lesson9.level5;

public interface BookReader {
    //Task 13 14 15 16 17 18 19 20 21 22 23 24
    boolean addNewBook(Book book);

    boolean isDuplicate(Book book);

    boolean isBlank(Book book);

    boolean deleteBook(Book book);

    String[] getCurrentBookList();

    Book[] getBooksByAuthorName(String authorName);

    Book[] getBooksByAuthorFirstName(String authorName);

    Book[] getBooksByTitleName(String titleName);

    Book[] getBooksByTitleFirstName(String titleName);

    boolean markAsRead(Book book);

    boolean markAsUnread(Book book);

    String[] getReadBooksList();

    String[] getUnreadBooksList();
}
