package student_julija_kuzmicova.lesson_11.level_3;

//Task_18
public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if(book.getYearOfIssue().equals(yearOfIssueToSearch)) {
            return true;
        }
        return false;
    }

}
