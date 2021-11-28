package student_sergej_pereligin.lesson_11.level_2;

import java.util.Optional;
import java.util.Set;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    Optional<Book> findByAuthor(String author);

    Optional<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);
}

