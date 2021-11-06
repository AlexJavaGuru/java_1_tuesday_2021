package student_oleg_kozlov.lesson_9.level_5;

// Task_13, Task_14, Task_15, Task_16, Task_17, Task_18
// Task_19, Task_20, Task_21, Task_22, Task_23, Task_24
interface BookReader {
    boolean addBook(Book book);

    boolean isDuplicateBook(Book book);

    boolean isValidBook(Book book);

    boolean deleteBook(Book book);

    String[] getAllBooksList();

    Book[] getBooksByAuthor(String author, boolean strictSearch);

    Book[] getBooksByTitle(String title, boolean strictSearch);

    boolean markBookAsRead(Book book);

    boolean markBookAsUnread(Book book);

    String[] getReadBooksList();

    String[] getUnreadBooksList();
}
