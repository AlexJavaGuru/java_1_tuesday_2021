package student_sergej_pereligin.lesson_9.level_5;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookCollectionImpl implements BookReader {

    public List<Book> booksLibrary;

    public BookCollectionImpl(List<Book> booksLibrary) {
        this.booksLibrary = booksLibrary;
    }

    @Override
    public void addBook(Book book) {
        if ((checkForDuplicates(book)) || !checkForInformation(book)) { //false
            System.out.println("Book already exists, exiting " + book.getName());
        } else { //true
            System.out.println("Book added " + book.getName());
            booksLibrary.add(book);
        }
    }


    public boolean checkForDuplicates(Book duplicateBook) {
        for (Book book : booksLibrary) {
            if (book.equals(duplicateBook)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkForInformation(Book book) {
        if (book.getAuthor().isEmpty() ||
                book.getName().isEmpty()) {
            System.out.println("Information is not full, book not added " + book.getName());
            return false;
        } else {
            return true;
        }
    }

    public boolean deleteBook(Book book) {
        if (booksLibrary.contains(book)) {
            booksLibrary.remove(book);
            System.out.println("Book is deleted " + book.getName());
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteBookByAuthor(String author) {
        Book foundBookForDelete = null;
        for (Book book : booksLibrary) {
            if (book.getAuthor().equals(author)) {
                foundBookForDelete = book;
                break;
            }
        }
        if (foundBookForDelete != null) {
            booksLibrary.remove(foundBookForDelete);
        }
        return false;
    }

    public Optional<Book> findByAuthor(String author) {
        for (Book book : booksLibrary) {
            if (book.getAuthor().equals(author)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }


    @Override
    public String toString() {
        return "BookCollectionImpl{" +
                "bookCollectionList=" + booksLibrary +
                '}';
    }
}





