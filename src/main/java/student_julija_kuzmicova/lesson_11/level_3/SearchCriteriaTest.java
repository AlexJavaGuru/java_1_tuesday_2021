package student_julija_kuzmicova.lesson_11.level_3;

import java.util.ArrayList;
import java.util.List;

//Task_16, Task_17, Task_18, Task_19, Task_20
class SearchCriteriaTest {

    Book book1 = new Book("Author1", "Title1", "2010");
    Book book2 = new Book("Author2", "Title2", "2012");
    Book book3 = new Book("Author3", "Title3", "2013");
    Book book4 = new Book("Author1", "Title2", "2015");

    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();
        test.matchAuthorSearchReturnTrueTest();
        test.matchAuthorSearchReturnFalseTest();

        test.matchTitleSearchReturnTrueTest();
        test.matchTitleSearchReturnFalseTest();

        test.matchYearOfIssueSearchReturnTrueTest();
        test.matchYearOfIssueSearchReturnFalseTest();

        test.matchAndSearchBothConditionsReturnTrueTest();
        test.matchAndSearchBothConditionsReturnFalseTest();
        test.matchAndSearchLeftConditionReturnFalseTest();
        test.matchAndSearchRightConditionReturnFalseTest();

        test.matchOrSearchBothConditionsReturnTrueTest();
        test.matchOrSearchBothConditionsReturnFalseTest();
        test.matchOrSearchLeftConditionsReturnTrueTest();
        test.matchOrSearchRightConditionsReturnTrueTest();

    }

    void matchAuthorSearchReturnTrueTest() {
        AuthorSearchCriteria authorSearch = new AuthorSearchCriteria("Author2");
        checkResult(true, authorSearch.match(book2), "matchAuthorSearchReturnTrueTest");
    }

    void matchAuthorSearchReturnFalseTest() {
        AuthorSearchCriteria authorSearch = new AuthorSearchCriteria("Author2");
        checkResult(false, authorSearch.match(book1), "matchAuthorSearchReturnFalseTest");
    }

    void matchTitleSearchReturnTrueTest() {
        TitleSearchCriteria titleSearch = new TitleSearchCriteria("Title3");
        checkResult(true, titleSearch.match(book3), "matchTitleSearchReturnTrueTest");
    }

    void matchTitleSearchReturnFalseTest() {
        TitleSearchCriteria titleSearch = new TitleSearchCriteria("Title3");
        checkResult(false, titleSearch.match(book4), "matchTitleSearchReturnFalseTest");
    }

    void matchYearOfIssueSearchReturnTrueTest() {
        YearOfIssueSearchCriteria yearOfIssueSearch = new YearOfIssueSearchCriteria("2015");
        checkResult(true, yearOfIssueSearch.match(book4), "matchYearOfIssueSearchReturnTrueTest");
    }

    void matchYearOfIssueSearchReturnFalseTest() {
        YearOfIssueSearchCriteria yearOfIssueSearch = new YearOfIssueSearchCriteria("2015");
        checkResult(false, yearOfIssueSearch.match(book1), "matchYearOfIssueSearchReturnFalseTest");
    }

    void matchAndSearchBothConditionsReturnTrueTest() {
        AndSearchCriteria andSearch = new AndSearchCriteria(
                new AuthorSearchCriteria("Author1"),
                new YearOfIssueSearchCriteria("2015"));
        checkResult(true, andSearch.match(book4), "matchAndSearchBothConditionsReturnTrueTest");
    }

    void matchAndSearchBothConditionsReturnFalseTest() {
        AndSearchCriteria andSearch = new AndSearchCriteria(
                new AuthorSearchCriteria("Author1"),
                new YearOfIssueSearchCriteria("2015"));
        checkResult(false, andSearch.match(book2), "matchAndSearchBothConditionsReturnFalseTest");
    }

    void matchAndSearchLeftConditionReturnFalseTest() {
        AndSearchCriteria andSearch = new AndSearchCriteria(
                new AuthorSearchCriteria("Author3"),
                new YearOfIssueSearchCriteria("2012"));
        checkResult(false, andSearch.match(book2), "matchAndSearchLeftConditionReturnFalseTest");
    }

    void matchAndSearchRightConditionReturnFalseTest() {
        AndSearchCriteria andSearch = new AndSearchCriteria(
                new AuthorSearchCriteria("Author2"),
                new YearOfIssueSearchCriteria("2010"));
        checkResult(false, andSearch.match(book2), "matchAndSearchRightConditionReturnFalseTest");
    }

    void matchOrSearchBothConditionsReturnTrueTest() {
        OrSearchCriteria orSearch = new OrSearchCriteria(
                new AuthorSearchCriteria("Author3"),
                new YearOfIssueSearchCriteria("2013"));
        checkResult(true, orSearch.match(book3), "matchOrSearchBothConditionsReturnTrueTest");
    }

    void matchOrSearchBothConditionsReturnFalseTest() {
        OrSearchCriteria orSearch = new OrSearchCriteria(
                new AuthorSearchCriteria("Author3"),
                new YearOfIssueSearchCriteria("2013"));
        checkResult(false, orSearch.match(book4), "matchOrSearchBothConditionsReturnFalseTest");
    }

    void matchOrSearchLeftConditionsReturnTrueTest() {
        OrSearchCriteria orSearch = new OrSearchCriteria(
                new TitleSearchCriteria("Title1"),
                new YearOfIssueSearchCriteria("2013"));
        checkResult(true, orSearch.match(book1), "matchOrSearchLeftConditionsReturnTrueTest");
    }

    void matchOrSearchRightConditionsReturnTrueTest() {
        OrSearchCriteria orSearch = new OrSearchCriteria(
                new YearOfIssueSearchCriteria("2012"),
                new AuthorSearchCriteria("Author1"));
        checkResult(true, orSearch.match(book4), "matchOrSearchRightConditionsReturnTrueTest");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
