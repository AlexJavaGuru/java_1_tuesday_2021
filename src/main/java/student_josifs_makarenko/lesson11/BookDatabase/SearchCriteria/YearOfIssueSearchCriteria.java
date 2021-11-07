package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

import student_josifs_makarenko.lesson11.BookDatabase.Book;

public class YearOfIssueSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        super(new Paging(), SortingCriteria.NONE);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch, Paging paging) {
        super(paging, SortingCriteria.NONE);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public YearOfIssueSearchCriteria(Paging paging, SortingCriteria searchCriteria, String yearOfIssueToSearch) {
        super(paging, searchCriteria);
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }
}
