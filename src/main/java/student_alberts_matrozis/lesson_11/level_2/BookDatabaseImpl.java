package student_alberts_matrozis.lesson_11.level_2;

import student_alberts_matrozis.lesson_11.level_2.SearchCriteria.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> database = new ArrayList<>();
    Long id = 1L;

    @Override
    public Long save(Book book) {
        book.setId(id);
        database.add(book);
        id++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : database) {
            if (Objects.equals(book.getId(), bookId)) {
                database.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (database.contains(book)) {
            database.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : database) {
            if (Objects.equals(book.getId(), bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> findedBooks = new ArrayList<>();
        for (Book book : database) {
            if (book.getAuthor().equals(author)) {
                findedBooks.add(book);
            }
        }
        return findedBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> findedBooks = new ArrayList<>();
        for (Book book : database) {
            if (book.getTitle().equals(title)) {
                findedBooks.add(book);
            }
        }
        return findedBooks;
    }

    @Override
    public int countAllBooks() {
        return database.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        database.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        database.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> findedBooks = new ArrayList<>();
        for (Book book : database) {
            if (searchCriteria.match(book)) {
                findedBooks.add(book);
            }
        }
        return findedBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> findedAuthors = new HashSet<>();
        for (Book book : database) {
            findedAuthors.add(book.getAuthor());
        }
        return findedAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> findedTitles = new HashSet<>();
        for (Book book : database) {
            findedTitles.add(book.getTitle());
        }
        return findedTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(database);
    }

    @Override
    public boolean contains(Book book) {
        for (Book book1 : database) {
            if (book.equals(book1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Set<String> authorSet = findUniqueAuthors();
        Map<String, List<Book>> result = new HashMap<>();
        for (String author : authorSet) {
            result.put(author, findByAuthor(author));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Set<String> authorSet = findUniqueAuthors();
        Map<String, Integer> result = new HashMap<>();
        for (String author : authorSet) {
            result.put(author, findByAuthor(author).size());
        }
        return result;
    }
}
