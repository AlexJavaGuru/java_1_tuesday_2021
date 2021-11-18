package student_daniel.lesson11.level2_3_4;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    //Task 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
    List<Book> allBooks = new ArrayList<>();
    private Long longID = 0L;

    @Override
    public Long save(Book book) {
        if (book != null) {
            longID++;
            book.setId(longID);
            allBooks.add(book);
            return book.getId();
        }
        return 0L;
    }

    @Override
    public boolean delete(Long bookId) {
        return allBooks.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        if (book != null && allBooks.contains(book)) {
            return allBooks.remove(book);
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book thisBook : allBooks) {
            if (thisBook.getId().equals(bookId)) {
                return Optional.of(thisBook);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        allBooks.stream()
                .filter(authorName -> authorName.getAuthor().equals(author))
                .forEachOrdered(booksByAuthor::add);
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        allBooks.stream()
                .filter(titleName -> titleName.getTitle().equals(title))
                .forEachOrdered(booksByTitle::add);
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {
        return allBooks.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        allBooks.removeIf(authorName -> authorName.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        allBooks.removeIf(titleName -> titleName.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksByCriteria = new ArrayList<>();
        for (Book thisBook : allBooks) {
            if (searchCriteria.match(thisBook)) {
                booksByCriteria.add(thisBook);
            }
        }
        return booksByCriteria;
    }

    @Override
    public boolean contains(Book book) {
        return allBooks.contains(book);
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> booksByAuthor = new HashSet<>();
        for (Book thisBook : allBooks) {
            booksByAuthor.add(thisBook.getAuthor());
        }
        return booksByAuthor;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> booksByTitle = new HashSet<>();
        for (Book thisBook : allBooks) {
            booksByTitle.add(thisBook.getTitle());
        }
        return booksByTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(allBooks);
    }
}