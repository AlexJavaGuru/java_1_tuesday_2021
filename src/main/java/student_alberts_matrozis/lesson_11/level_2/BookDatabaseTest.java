package student_alberts_matrozis.lesson_11.level_2;

import student_alberts_matrozis.lesson_11.level_2.SearchCriteria.*;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.saveTest();
        test.deleteByIdTest();
        test.deleteByBookTest();
        test.findByIdTest();
        test.findByAuthorTest();
        test.findByTitleTest();
        test.countAllBooksTest();
        test.deleteByAuthorTest();
        test.deleteByTitleTest();
        test.findTest();
        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();
        test.containsTest();
        test.getAuthorsToBooksMapTest();
        test.getEachAuthorBookCountTest();
    }

    public void saveTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in Kotlin", "2015");
        bookDatabase.save(book);
        check(bookDatabase.countAllBooks(), 1);
    }

    public void deleteByIdTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.delete(1L);
        check(bookDatabase.database.get(0).equals(book2), true);
    }

    public void deleteByBookTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.delete(book);
        check(bookDatabase.database.get(0).equals(book2), true);
    }

    public void findByIdTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        Optional<Book> findedBook = bookDatabase.findById(2L);
        findedBook.ifPresent(data -> check(data.equals(book2), true));
    }

    public void findByAuthorTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        List<Book> findedBooks = bookDatabase.findByAuthor("James");
        check(findedBooks.size(), 2);
    }

    public void findByTitleTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        List<Book> findedBooks = bookDatabase.findByTitle("Algorithms");
        check(findedBooks.size(), 1);
    }

    public void countAllBooksTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        check(2, bookDatabase.countAllBooks());
    }

    public void deleteByAuthorTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("James");
        check(bookDatabase.countAllBooks(), 1);
    }

    public void deleteByTitleTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("Algorithms");
        check(bookDatabase.countAllBooks(), 2);
    }

    public void findTest() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                        new YearOfIssueSearchCriteria("2015"),
                        new TitleSearchCriteria("Algorithms"));
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> findedBooks = bookDatabase.find(searchCriteria);
        check(findedBooks.get(0).equals(book) && findedBooks.get(1).equals(book2), true);
    }

    public void findUniqueAuthorsTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> findedAuthors = bookDatabase.findUniqueAuthors();
        check(findedAuthors.size(), 2);
    }

    public void findUniqueTitlesTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> findedTitles = bookDatabase.findUniqueTitles();
        check(findedTitles.size(), 3);
    }

    public void findUniqueBooksTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> findedBooks = bookDatabase.findUniqueBooks();
        check(findedBooks.size(), 3);
    }

    public void containsTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        check(bookDatabase.findUniqueBooks().contains(book), true);
    }

    public void getAuthorsToBooksMapTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Map<String, List<Book>> result = bookDatabase.getAuthorToBooksMap();
        check(result.isEmpty(), false);
    }

    public void getEachAuthorBookCountTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("James", "Programming in JavaScript", "2015");
        Book book2 = new Book("James", "Algorithms", "2015");
        Book book3 = new Book("Charlie", "Python for Beginners", "2077");
        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Map<String, Integer> result = bookDatabase.getEachAuthorBookCount();
        check(result.isEmpty(), false);
    }
}
