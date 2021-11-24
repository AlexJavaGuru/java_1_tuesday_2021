package student_julija_kuzmicova.lesson_11.level_2;

import java.util.List;
import java.util.Optional;

//Task_6, Task_7, Task_8, Task_9, Task_10, Task_11, Task_12, Task_13, Task_14
public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);
}
