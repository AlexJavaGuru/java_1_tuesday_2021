package student_sergej_pereligin.lesson_11.level_2;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class BookDataBaseImpl implements BookDatabase {

    List<Book> bookLibrary;
    long lastBookId = 0;

    public BookDataBaseImpl(List<Book> bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public Long save(Book book) {

        book.setId(lastBookId);
        bookLibrary.add(book);
        lastBookId++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        Book foundBookId = null;
        for (Book book : bookLibrary) {
            if (book.getId().equals(bookId)) {
                foundBookId = book;
            }
        }
        if (foundBookId != null) {
            return bookLibrary.remove(foundBookId);
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {
        if (bookLibrary.contains(book)) {
            bookLibrary.remove(book);
            System.out.println("Book is deleted" + book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookLibrary) {
            if (book.getId().equals(bookId)) {
                System.out.println("Book is find" + book);
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Book> findByAuthor(String author) {
        for (Book book : bookLibrary) {
            if (book.getAuthor().equals(author)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        for (Book book : bookLibrary) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public int countAllBooks() {
        return bookLibrary.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        Book foundBookForDelete = null;
        for (Book book : bookLibrary) {
            if (book.getAuthor().equals(author)) {
                foundBookForDelete = book;
                System.out.println("Book is deleted by Author" + author);
                break;
            }
        }
        if (foundBookForDelete != null) {
            bookLibrary.remove(foundBookForDelete);
            System.out.println("Book not deleted by Author" + author);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Book foundBookForDelete = null;
        for (Book book : bookLibrary) {
            if (book.getAuthor().equals(title)) {
                foundBookForDelete = book;
                System.out.println("Book is deleted by Author" + title);
                break;
            }
        }
        if (foundBookForDelete != null) {
            bookLibrary.remove(foundBookForDelete);
            System.out.println("Book not deleted by Author" + title);
        }
    }


    @Override
    public Set<String> findUniqueAuthors() {

        Set<String> authors = new HashSet<>();
        for (Book book : bookLibrary) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {

        Set<String> titles = new HashSet<>();
        for (Book book : bookLibrary) {
            titles.add(book.getAuthor());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {

        Set<Book> books = new HashSet<>();
        books.addAll(books);
        return books;
    }

    @Override
    public boolean contains(Book book) {

        if (bookLibrary.contains(book)) {
            System.out.println("Book is contains" + book);
            return true;
        } else {
            return false;
        }
    }
}