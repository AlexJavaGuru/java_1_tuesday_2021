package student_julija_kuzmicova.lesson_9.level_5;

//Task_13, Task_14, Task_15, Task_16, Task_17, Task_18, Task_19, Task_20, Task_21, Task_22, Task_23, Task_24
interface BookReader {

    boolean isBookAdded(Book book);
    boolean isBookValid(Book book);
    boolean isBookDuplicate(Book book);
    boolean isBookDeleted(Book book);
    String[] booksList();
    Book[] searchByAuthor(String author);
    Book[] searchByTitle(String title);
    boolean markBookAsRead(Book book);
    boolean markBookAsUnread(Book book);
    String[] readBooksList();
    String[] unreadBooksList();
}
