package student_daniel.lesson11.level2_3_4;

public class YearOfIssueSearchCriteria extends BookDatabaseImpl implements SearchCriteria {
    //Task 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }
}