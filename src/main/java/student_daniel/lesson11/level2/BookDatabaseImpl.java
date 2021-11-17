package student_daniel.lesson11.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {
    //Task 6 7 8 9 10 11 12 13 14
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
        if (bookId != null) {
            return allBooks.removeIf(book -> book.getId().equals(bookId));
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (book != null && allBooks.contains(book)) {
            allBooks.remove(book);
            return true;
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
}