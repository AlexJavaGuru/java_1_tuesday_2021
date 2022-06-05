package student_daniel.lesson11.level2_3_4;

import java.util.*;

public class BookTest {
    //Task 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
    public static void main(String[] args) {
        BookTest myTest = new BookTest();
        myTest.saveSingleBook();
        myTest.saveSingleBookNull();
        myTest.saveMultipleBooks();
        myTest.deleteSingleBookById();
        myTest.deleteSingleBookByIdWithIncorrectId();
        myTest.deleteSingleBook();
        myTest.deleteMultipleBooks();
        myTest.findBookById();
        myTest.findBookByIdEmpty();
        myTest.findBookByAuthor();
        myTest.findBookByTitle();
        myTest.bookCount();
        myTest.deleteByAuthor();
        myTest.deleteByTitle();

        myTest.criteriaByAuthorWithMatch();
        myTest.criteriaByAuthorWithoutMatch();
        myTest.criteriaByTitleWithMatch();
        myTest.criteriaByTitleWithoutMatch();
        myTest.criteriaByYearWithMatch();
        myTest.criteriaByYearWithoutMatch();
        myTest.andSearchCriteriaWithMatch();
        myTest.andSearchCriteriaWithoutAuthorMatch();
        myTest.andSearchCriteriaWithoutTitleMatch();
        myTest.orSearchCriteriaWithMatch();
        myTest.orSearchCriteriaOnlyAuthorMatch();
        myTest.orSearchCriteriaOnlyTitleMatch();
        myTest.orSearchCriteriaWithoutAnyMatch();
        myTest.findListOfCriteria();

        myTest.bookContains();
        myTest.bookNotContains();
        myTest.findUniqueAuthors();
        myTest.findUniqueTitles();
        myTest.findUnique();
        myTest.findUniqueWords();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Tests
    void saveSingleBook() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added Once", "2000");
        bookList.save(newBook);
        Long expectedResult = 1L;
        Long actualResult = bookList.allBooks.get(0).getId();
        check(expectedResult, actualResult, "One book is added >>> Return ID : " + actualResult);
    }

    void saveSingleBookNull() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Long expectedResult = 0L;
        Long actualResult = bookList.save(null);
        check(expectedResult, actualResult, "Null as book >>> Return ID : " + actualResult);
    }

    void saveMultipleBooks() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        Long expectedResult = 2L;
        Long actualResult = bookList.allBooks.get(1).getId();
        check(expectedResult, actualResult, "Two books are added >>> Return ID of second book: " + actualResult);
    }

    void deleteSingleBookById() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2); //removing this book later
        bookList.save(newBook3);
        boolean actualResult = bookList.delete(2L); //only 1L and 3L are left
        check(true, actualResult, "Three books are added >>> One book is deleted >>> Return : " + actualResult);
    }

    void deleteSingleBookByIdWithIncorrectId() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        boolean actualResult = bookList.delete(4L); //4L is invalid id, book will not be found, and will not be deleted
        check(false, actualResult, "Three books are added >>> None are deleted >>> Return : " + actualResult);
    }

    void deleteSingleBook() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 4", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        boolean actualResult = bookList.delete(newBook2);
        check(true, actualResult, "Four books are added >>> Delete Second Book >>> Return : " + actualResult);
    }

    void deleteMultipleBooks() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 4", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        boolean actualResult = bookList.delete(newBook2) && bookList.delete(newBook3);
        check(true, actualResult, "Four books are added >>> Delete Two Books >>> Return : " + actualResult);
    }

    void findBookById() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 4", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        Optional<Book> actualResult = bookList.findById(3L);
        check(true, actualResult.isPresent(), "Four books are added >>> Search book by ID >>> The Book is present : " + actualResult);
    }

    void findBookByIdEmpty() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 4", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        Optional<Book> actualResult = bookList.findById(999L);
        check(false, actualResult.isPresent(), "Four books are added >>> Search book by unexisting ID >>> The Book is not present : " + actualResult);
    }

    void findBookByAuthor() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Tom", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Tom", "2000");
        Book newBook4 = new Book("Book 4", "Added 4", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        String authorName = "Tom";
        List<Book> expectedResult = List.of(newBook, newBook3);
        List<Book> actualResult = bookList.findByAuthor(authorName);
        check(expectedResult, actualResult, "Four books are added >>> Search books by Author >>> Return List of books : " + actualResult);
    }

    void findBookByTitle() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Cat", "Tom", "2000");
        Book newBook2 = new Book("Cat", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Tom", "2000");
        Book newBook4 = new Book("Book 4", "Added 4", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        String titleName = "Cat";
        List<Book> expectedResult = List.of(newBook, newBook2);
        List<Book> actualResult = bookList.findByTitle(titleName);
        check(expectedResult, actualResult, "Four books are added >>> Search books by Title >>> Return List of books : " + actualResult);
    }

    void bookCount() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        int expectedResult = 3;
        int actualResult = bookList.countAllBooks();
        check(expectedResult, actualResult, "Three books are added >>> Total count of books  >>> Return : " + actualResult);
    }

    void deleteByAuthor() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 2", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        String authorName = "Added 2";
        bookList.deleteByAuthor(authorName);
        List<Book> expectedResult = List.of(newBook, newBook3);
        List<Book> actualResult = bookList.allBooks;
        check(expectedResult, actualResult, "Four books are added >>> Two books are deleted by Author >>> Return : " + actualResult);
    }

    void deleteByTitle() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 4", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 2", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        String titleName = "Book 4";
        bookList.deleteByTitle(titleName);
        List<Book> expectedResult = List.of(newBook, newBook2);
        List<Book> actualResult = bookList.allBooks;
        check(expectedResult, actualResult, "Four books are added >>> Two books are deleted by Title >>> Return : " + actualResult);
    }

    void criteriaByAuthorWithMatch() {
        AuthorSearchCriteria bookList = new AuthorSearchCriteria("Added 2");
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        boolean actualResult = bookList.match(newBook2);
        check(true, actualResult, "Two books are added >>> Find any match by Author (With match) >>> Return : " + actualResult);
    }

    void criteriaByAuthorWithoutMatch() {
        AuthorSearchCriteria bookList = new AuthorSearchCriteria("Abrakadabra");
        Book newBook = new Book("Book 1", "Added 1", "2000");
        bookList.save(newBook);
        boolean actualResult = bookList.match(newBook);
        check(false, actualResult, "One book is added >>> Find any match by Author (Without match) >>> Return : " + actualResult);
    }

    void criteriaByTitleWithMatch() {
        TitleSearchCriteria bookList = new TitleSearchCriteria("Book 4");
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 4", "Added 2", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        boolean actualResult = bookList.match(newBook2);
        check(true, actualResult, "Two books are added >>> Find any match by Title (With match) >>> Return : " + actualResult);
    }

    void criteriaByTitleWithoutMatch() {
        TitleSearchCriteria bookList = new TitleSearchCriteria("Abrakadabra");
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 4", "Added 3", "2000");
        Book newBook4 = new Book("Book 4", "Added 2", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook4);
        boolean actualResult = bookList.match(newBook);
        check(false, actualResult, "Four books are added >>> Found any match by Title (Without match) >>> Return : " + actualResult);
    }

    void criteriaByYearWithMatch() {
        YearOfIssueSearchCriteria bookList = new YearOfIssueSearchCriteria("1984");
        Book newBook = new Book("Book 1", "Added 1", "1975");
        Book newBook2 = new Book("Book 2", "Added 2", "1984");
        bookList.save(newBook);
        bookList.save(newBook2);
        boolean actualResult = bookList.match(newBook2);
        check(true, actualResult, "Two books are added >>> Find match by Year (With match) >>> Return : " + actualResult);
    }

    void criteriaByYearWithoutMatch() {
        YearOfIssueSearchCriteria bookList = new YearOfIssueSearchCriteria("0");
        Book newBook = new Book("Book 1", "Added 1", "1975");
        bookList.save(newBook);
        boolean actualResult = bookList.match(newBook);
        check(false, actualResult, "One books is added >>> Find match by Year (Without match) >>> Return : " + actualResult);
    }

    void andSearchCriteriaWithMatch() {
        AndSearchCriteria criteriaBookList = new AndSearchCriteria(
                new TitleSearchCriteria("Book 1"),
                new AuthorSearchCriteria("Added 1"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(true, actualResult, "Find match by SearchCriteria (With match) >>> Return : " + actualResult);
    }

    void andSearchCriteriaWithoutAuthorMatch() {
        AndSearchCriteria criteriaBookList = new AndSearchCriteria(
                new TitleSearchCriteria("Book 1"),
                new AuthorSearchCriteria("Wrong"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(false, actualResult, "Find match by SearchCriteria (Without Author match) >>> Return : " + actualResult);
    }

    void andSearchCriteriaWithoutTitleMatch() {
        AndSearchCriteria criteriaBookList = new AndSearchCriteria(
                new TitleSearchCriteria("Wrong"),
                new AuthorSearchCriteria("Added 1"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(false, actualResult, "Find match by SearchCriteria (Without Title match) >>> Return : " + actualResult);
    }

    void orSearchCriteriaWithMatch() {
        OrSearchCriteria criteriaBookList = new OrSearchCriteria(
                new TitleSearchCriteria("Book 1"),
                new AuthorSearchCriteria("Added 1"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(true, actualResult, "Find match by SearchCriteria (With match) >>> Return : " + actualResult);
    }

    void orSearchCriteriaOnlyAuthorMatch() {
        OrSearchCriteria criteriaBookList = new OrSearchCriteria(
                new TitleSearchCriteria("Wrong"),
                new AuthorSearchCriteria("Added 1"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(true, actualResult, "Find match by SearchCriteria (Without Author match) >>> Return : " + actualResult);
    }

    void orSearchCriteriaOnlyTitleMatch() {
        OrSearchCriteria criteriaBookList = new OrSearchCriteria(
                new TitleSearchCriteria("Book 1"),
                new AuthorSearchCriteria("Wrong"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(true, actualResult, "Find match by SearchCriteria (Without Title match) >>> Return : " + actualResult);
    }

    void orSearchCriteriaWithoutAnyMatch() {
        OrSearchCriteria criteriaBookList = new OrSearchCriteria(
                new TitleSearchCriteria("Wrong"),
                new AuthorSearchCriteria("Wrong"));
        Book newBook = new Book("Book 1", "Added 1", "1975");
        boolean actualResult = criteriaBookList.match(newBook);
        check(false, actualResult, "Find match by SearchCriteria (With match) >>> Return : " + actualResult);
    }

    void findListOfCriteria() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "1984");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook2);
        AndSearchCriteria criteriaBookList = new AndSearchCriteria(
                new TitleSearchCriteria("Book 2"),
                new AuthorSearchCriteria("Added 2"));
        List<Book> expectedResult = List.of(newBook2, newBook2);
        List<Book> actualResult = bookList.find(criteriaBookList);
        check(expectedResult, actualResult, "Four books are added >>> Search books by Title >>> Return List of books : " + actualResult);
    }

    void bookContains() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook3);
        boolean actualResult = bookList.contains(newBook2);
        check(true, actualResult, "Three books are added >>> Checking if second book contains (Contains) >>> Return : " + actualResult);
    }

    void bookNotContains() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        boolean actualResult = bookList.contains(newBook3);
        check(false, actualResult, "Two books are added >>> Checking if third book contains (Not Contains) >>> Return : " + actualResult);
    }

    void findUniqueAuthors() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook2);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Added 1");
        expectedResult.add("Added 2");
        expectedResult.add("Added 3");
        Set<String> actualResult = bookList.findUniqueAuthors();
        checkString(expectedResult, actualResult, "Six books are added >>> Find Uniq Authors >>> Return : " + actualResult);
    }

    void findUniqueTitles() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook2);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Book 1");
        expectedResult.add("Book 2");
        expectedResult.add("Book 3");
        Set<String> actualResult = bookList.findUniqueTitles();
        checkString(expectedResult, actualResult, "Six books are added >>> Find Uniq Titles >>> Return : " + actualResult);
    }

    void findUnique() {
        BookDatabaseImpl bookList = new BookDatabaseImpl();
        Book newBook = new Book("Book 1", "Added 1", "2000");
        Book newBook2 = new Book("Book 2", "Added 2", "2000");
        Book newBook3 = new Book("Book 3", "Added 3", "2000");
        bookList.save(newBook);
        bookList.save(newBook2);
        bookList.save(newBook2);
        bookList.save(newBook2);
        bookList.save(newBook3);
        bookList.save(newBook3);
        Set<Book> expectedResult = Set.of(newBook, newBook2, newBook3);
        Set<Book> actualResult = bookList.findUniqueBooks();
        check(expectedResult, actualResult, "Six books are added >>> Find only Uniq Books >>> Return : " + actualResult);
    }

    void findUniqueWords() {
        UniqueWordFinder bookList = new UniqueWordFinder();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("apple");
        expectedResult.add("banana");
        expectedResult.add("cherry");
        expectedResult.add("bomb");
        String searchInText = "apple apple banana bomb bomb bomb bomb bomb bomb bomb bomb cherry";
        Set<String> actualResult = bookList.find(searchInText);
        checkString(expectedResult, actualResult, "String with 12 words is added >>> Find only Uniq Words >>> Return : " + actualResult);
    }

    void check(Long expectedResult, Long actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(boolean expectedResult, boolean actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(List<Book> expectedResult, List<Book> actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(Set<Book> expectedResult, Set<Book> actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void checkString(Set<String> expectedResult, Set<String> actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }

    void check(int expectedResult, int actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}