package student_josifs_makarenko.lesson_9.level5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookReaderImpl implements BookReader {


    private List<Book> library = new ArrayList<>();
    private List<Book> readBook = new ArrayList<>();
    private List<Book> unreadBook = new ArrayList<>();

    @Override
    public boolean addBookToLibrary(Book book) {
        boolean result = false;
        if (firstRule(book) && secondRule(book)) {
            library.add(book);
            result = true;
        }
        return result;
    }

    public boolean deleteBookFromLibrary(Book book) {

        boolean result = false;

        if (secondRule(book)) {
            library.remove(book);
            result = true;
        }
        return result;
    }

    public void showLibrary() {
        System.out.println(library);
    }

    public Book[] findByAuthor(String author) {
        int length = 0;
        for (Book book : library) {
            if (book.getAuthor().contains(author) || book.getAuthor().equals(author)) {
                length++;
            }
        }
        Book[] result = new Book[length];
        int temp = 0;

        for (Book book : library) {
            if (book.getAuthor().contains(author) || book.getAuthor().equals(author)) {
                result[temp] = book;
                temp++;
            }
        }

        return result;
    }

    @Override
    public Book[] findByName(String name) {
        int length = 0;
        for (Book book : library) {
            if (book.getName().contains(name) || book.getName().equals(name)) {
                length++;
            }
        }
        Book[] result = new Book[length];
        int temp = 0;

        for (Book book : library) {
            if (book.getName().contains(name) || book.getName().equals(name)) {
                result[temp] = book;
                temp++;
            }
        }

        return result;
    }

    @Override
    public boolean markAsRead(Book book) {
        for (Book book1 : library) {
            if (book1 == book) {
                readBook.add(book);
                return  true;
            }
        }
        return  false;
    }

    @Override
    public boolean markAsUnread(Book book) {
        for (Book book1 : library) {
            if (book1 == book) {
                unreadBook.add(book);
                return  true;
            }
        }
        return  false;
    }

    @Override
    public void showReadBook() {
        System.out.println(readBook);
    }

    @Override
    public void showUnreadBook() {
        System.out.println(unreadBook);
    }


    private boolean firstRule(Book book) {
        for (Book value : library) {
            if (value.getAuthor().equals(book.getAuthor()) && value.getName().equals(book.getName())) {
                return false;
            }
        }
        return true;
    }

    private boolean secondRule(Book book) {
        return book.getAuthor() != null && book.getName() != null;
    }
}
