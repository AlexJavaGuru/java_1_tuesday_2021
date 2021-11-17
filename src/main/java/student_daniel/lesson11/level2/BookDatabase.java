package student_daniel.lesson11.level2;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {
    //Task 6 7 8 9 10 11 12 13 14
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