package student_josifs_makarenko.lesson11.BookDatabase;

import org.junit.jupiter.api.Test;
import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.AndSearchCriteria;
import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.AuthorSearchCriteria;
import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.TitleSearchCriteria;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    @Test
    void shouldSave() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        assertEquals(1L, bookDatabase.save(new Book("1", "2", "3")));
    }

    @Test
    void shouldDeleteById() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("1", "2", "3"));
        assertTrue(bookDatabase.delete(1L));
    }

    @Test
    void shouldDeleteByBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        bookDatabase.save(book);
        assertTrue(bookDatabase.delete(book));
    }

    @Test
    void shouldFindById() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        bookDatabase.save(book);
        assertEquals(Optional.of(book), bookDatabase.findById(1L));
    }

    @Test
    void shouldFindByIdIfEmpty() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        assertEquals(Optional.empty(), bookDatabase.findById(1L));
    }

    @Test
    void shouldFindByAuthor() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        bookDatabase.save(book);
        List<Book> result = Collections.singletonList(book);

        assertEquals(result, bookDatabase.findByAuthor("1"));
    }

    @Test
    void shouldFindByTitle() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        bookDatabase.save(book);
        List<Book> result = Collections.singletonList(book);

        assertEquals(result, bookDatabase.findByTitle("2"));
    }

    @Test
    void countAllBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("1", "2", "3"));

        assertEquals(1, bookDatabase.countAllBooks());
    }


    @Test
    void find() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        Book book1 = new Book("1", "4", "5");
        Book book2 = new Book("1", "2", "5");
        Book book3 = new Book("1", "4", "5");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> result = new java.util.ArrayList<>(Collections.singletonList(book));
        result.add(book2);

        assertEquals(result, bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("1"), new TitleSearchCriteria("2"))));
    }

    @Test
    void shouldFindUniqueTitles() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        Book book1 = new Book("2", "4", "5");
        Book book2 = new Book("1", "2", "5");
        Book book3 = new Book("1", "4", "5");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Set<String> result = new HashSet<>();
        result.add("2");
        result.add("4");

        assertEquals(result, bookDatabase.findUniqueTitles());
    }

    @Test
    void shouldFindUniqueAuthors() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        Book book1 = new Book("2", "4", "5");
        Book book2 = new Book("1", "2", "5");
        Book book3 = new Book("1", "4", "5");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Set<String> result = new HashSet<>();
        result.add("1");
        result.add("2");

        assertEquals(result, bookDatabase.findUniqueAuthors());
    }

    @Test
    void shouldFindUniqueBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Lem", "Edem", "3");
        Book book1 = new Book("Gogol", "Nos", "5");
        Book book2 = new Book("Lem", "Edem", "3");
        Book book3 = new Book("Lem", "Edem", "3");
        bookDatabase.save(book);
        bookDatabase.save(book);
        bookDatabase.save(book);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book1);
        bookDatabase.save(book1);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book2);
        bookDatabase.save(book2);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book3);
        bookDatabase.save(book3);
        bookDatabase.save(book3);
        bookDatabase.save(book3);
        bookDatabase.save(book3);
        bookDatabase.save(book3);

        Set<Book> result = new HashSet<>();
        result.add(book);
        result.add(book1);
        result.add(book2);
        result.add(book3);

        assertEquals(result, bookDatabase.findUniqueBooks());
    }

    @Test
    void isContains() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");

        bookDatabase.save(book);


        assertTrue(bookDatabase.contains(book));
    }

    @Test
    void shouldGetAuthorToBooksMap() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        Book book1 = new Book("2", "4", "5");
        Book book2 = new Book("1", "2", "5");
        Book book3 = new Book("1", "4", "5");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<Book> firstList = new ArrayList<>();
        List<Book> secondList = new ArrayList<>();

        firstList.add(book);
        firstList.add(book2);
        firstList.add(book3);
        secondList.add(book1);

        Map<String, List<Book>> result = new HashMap<>();
        result.put("1", firstList);
        result.put("2", secondList);

        assertEquals(result, bookDatabase.getAuthorToBooksMap());
    }

    @Test
    void shouldGetEachAuthorBookCount() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("1", "2", "3");
        Book book1 = new Book("2", "4", "5");
        Book book2 = new Book("1", "2", "5");
        Book book3 = new Book("1", "4", "5");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        Map<String, Integer> result = new HashMap<>();
        result.put("1", 3);
        result.put("2", 1);

        assertEquals(result, bookDatabase.getEachAuthorBookCount());
    }
}