package student_josifs_makarenko.lesson11.BookDatabase;

import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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
    List<Book> find(SearchCriteria searchCriteria);
    void showBookDatabase();
    Set<String> findUniqueTitles();
    Set<String> findUniqueAuthors();
    Set<Book> findUniqueBooks();
    boolean contains(Book book);
    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();
}
