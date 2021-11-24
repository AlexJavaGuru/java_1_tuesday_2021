package student_julija_kuzmicova.lesson_11.level_3;

import java.util.*;

//Task_22, Task_23, Task_24, Task_25, Task_26, Task_28, Task_29
class BookDatabaseTest {

    BookDatabaseImpl database = new BookDatabaseImpl();
    Book book1 = new Book("Author1", "Title1", "2010");
    Book book2 = new Book("Author2", "Title2", "2012");
    Book book3 = new Book("Author3", "Title3", "2013");
    Book book4 = new Book("Author1", "Title2", "2015");
    Book book5 = new Book("Author3", "Title1", "2013");

    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.findAuthorSearchTest();
        test.findTitleSearchTest();
        test.findYearOfIssueSearchTest();
        test.findAndSearchTest();
        test.findOrSearchTest();

        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();

        test.containsReturnTrueTest();
        test.containsReturnFalseTest();

        test.getAuthorToBooksMapTest();
        test.getEachAuthorBookCountTest();
    }

    void findAuthorSearchTest() {
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Author3");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        expectedResult.add(book5);
        checkResult(expectedResult, database.find(searchCriteria), "findAuthorSearchTest");
    }

    void findTitleSearchTest() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("Title2");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        expectedResult.add(book4);
        checkResult(expectedResult, database.find(searchCriteria), "findTitleSearchTest");
    }

    void findYearOfIssueSearchTest() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2010");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        checkResult(expectedResult, database.find(searchCriteria), "findYearOfIssueSearchTest");
    }

    void findAndSearchTest() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new YearOfIssueSearchCriteria("2013"),
                new TitleSearchCriteria("Title3"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        checkResult(expectedResult, database.find(searchCriteria), "findAndSearchTest");
    }

    void findOrSearchTest() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2013"),
                new TitleSearchCriteria("Title1"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        expectedResult.add(book5);
        checkResult(expectedResult, database.find(searchCriteria), "findOrSearchTest");
    }

    void findUniqueAuthorsTest() {
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Author1");
        expectedResult.add("Author2");
        expectedResult.add("Author3");
        checkResult(expectedResult, database.findUniqueAuthors(), "findUniqueAuthorsTest");
    }

    void findUniqueTitlesTest() {
        database.delete(book3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Title1");
        expectedResult.add("Title2");
        checkResult(expectedResult, database.findUniqueTitles(), "findUniqueTitlesTest");
    }

    void findUniqueBooksTest() {
        database.save(book3);
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        expectedResult.add(book4);
        expectedResult.add(book5);
        checkResultSetBook(expectedResult, database.findUniqueBooks(), "findUniqueBooksTest");
    }

    void containsReturnTrueTest() {
        checkResult(true, database.contains(book3), "containsReturnTrueTest");
    }

    void containsReturnFalseTest() {
        database.delete(book3);
        checkResult(false, database.contains(book3), "containsReturnFalseTest");
    }

    void getAuthorToBooksMapTest() {
        Map<String, List<Book>> expectedResult = new HashMap<>();
        List<Book> author1 = new ArrayList<>();
        author1.add(book1);
        author1.add(book4);
        List<Book> author2 = new ArrayList<>();
        author2.add(book2);
        List<Book> author3 = new ArrayList<>();
        author3.add(book5);
        expectedResult.put("Author1", author1);
        expectedResult.put("Author2", author2);
        expectedResult.put("Author3", author3);
        checkResult(expectedResult, database.getAuthorToBooksMap(), "getAuthorToBooksMapTest");
    }

    void getEachAuthorBookCountTest() {
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Author1", 2);
        expectedResult.put("Author2", 1);
        expectedResult.put("Author3", 1);
        checkResultMapInteger(expectedResult, database.getEachAuthorBookCount(), "getEachAuthorBookCountTest");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(List<Book> expectedResult, List<Book> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(Set<String> expectedResult, Set<String> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResultSetBook(Set<Book> expectedResult, Set<Book> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(Map<String, List<Book>> expectedResult, Map<String, List<Book>> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
    void checkResultMapInteger(Map<String, Integer> expectedResult, Map<String, Integer> actualResult, String testName){
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
