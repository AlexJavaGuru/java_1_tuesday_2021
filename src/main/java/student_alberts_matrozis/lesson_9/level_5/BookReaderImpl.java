package student_alberts_matrozis.lesson_9.level_5;

import java.util.ArrayList;
import java.util.Arrays;

public class BookReaderImpl implements BookReader {

    private final ArrayList<Book> database = new ArrayList<>();

    public boolean isDublicateBook(Book book) {
        for (Book book1 : database) {
            if (book1.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addBook(Book newBook) {
        if (newBook.getAuthor().isEmpty() || newBook.getTitle().isEmpty()) return false;
        if (isDublicateBook(newBook)) return false;
        database.add(newBook);
        return true;
    }

    @Override
    public boolean removeBook(Book book) {
        if (isDublicateBook(book)) {
            database.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Book[] showAllBooks() {
        return database.toArray(new Book[database.size()]);
    }

    @Override
    public Book[] findBookByAuthor(String author) {
        Book[] findedBooks = new Book[database.size()];
        int i = 0;
        for (Book book : database) {
            if (book.getAuthor().equals(author) || book.getAuthor().startsWith(author)) {
                findedBooks[i] = book;
                i++;
            }
        }
        return Arrays.copyOf(findedBooks, i);
    }

    @Override
    public Book[] findBookByTitle(String title) {
        Book[] findedBooks = new Book[database.size()];
        int i = 0;
        for (Book book : database) {
            if (book.getTitle().equals(title) || book.getTitle().startsWith(title)) {
                findedBooks[i] = book;
                i++;
            }
        }
        return Arrays.copyOf(findedBooks, i);
    }

    @Override
    public boolean makeReaded(Book book) {
        if (isDublicateBook(book)) {
            book.setReaded(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean makeUnReaded(Book book) {
        if (isDublicateBook(book)) {
            book.setReaded(false);
            return true;
        }
        return false;
    }

    @Override
    public Book[] showAllReadedBooks() {
        Book[] findedBooks = new Book[database.size()];
        int i = 0;
        for (Book book : database) {
            if (book.isReaded()) {
                findedBooks[i] = book;
                i++;
            }
        }
        return Arrays.copyOf(findedBooks, i);
    }

    @Override
    public Book[] showAllUnReadedBooks() {
        Book[] findedBooks = new Book[database.size()];
        int i = 0;
        for (Book book : database) {
            if (!book.isReaded()) {
                findedBooks[i] = book;
                i++;
            }
        }
        return Arrays.copyOf(findedBooks, i);
    }
}
