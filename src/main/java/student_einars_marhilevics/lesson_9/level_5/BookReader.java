package student_einars_marhilevics.lesson_9.level_5;

interface BookReader {

    boolean addBook(Book book);

    boolean isDuplicateBook(Book book);

    boolean fullInfoBook(Book book);

    boolean removeBook(Book book);

    String[] getAllBooks();

    Book[] getBooksByAuthor(String author);

    Book[] getBooksByTitle(String title);

    boolean markBookAsRead(Book book);

    boolean markBookAsUnread(Book book);

    String[] getReadBooksList();

    String[] getUnreadBooksList();
}
