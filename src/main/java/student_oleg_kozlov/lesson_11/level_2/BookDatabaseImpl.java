package student_oleg_kozlov.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Task_6, Task_7, Task_8, Task_9, Task_10, Task_11, Task_12, Task_13, Task_14
class BookDatabaseImpl implements BookDatabase {
    private List<Book> books;
    private static long currentId;

    public List<Book> getBooks() {
        return books;
    }

    public BookDatabaseImpl() {
        books = new ArrayList<>();
        currentId = 0L;
    }

    @Override
    public Long save(Book book) {
        if (book == null) {
            return 0L;
        }
        book.setId(++currentId);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        Book bookToDelete = null;
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                bookToDelete = book;
                break;
            }
        }
        return books.remove(bookToDelete);
    }

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksToDelete = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksToDelete.add(book);
            }
        }
        if (booksToDelete.size() > 0) {
            for (Book book : booksToDelete) {
                books.remove(book);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> booksToDelete = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksToDelete.add(book);
            }
        }
        if (booksToDelete.size() > 0) {
            for (Book book : booksToDelete) {
                books.remove(book);
            }
        }
    }
}
