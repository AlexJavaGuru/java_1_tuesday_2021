package student_oleg_kozlov.lesson_11.level_3;

// Task_18, Task_39, Task_40
public class YearOfIssueSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        super(new Paging(), SortingType.NONE);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch, Paging paging) {
        super(paging, SortingType.NONE);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch, Paging paging, SortingType sortingType) {
        super(paging, sortingType);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book != null && book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}
