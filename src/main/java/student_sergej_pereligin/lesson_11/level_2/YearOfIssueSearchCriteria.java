package student_sergej_pereligin.lesson_11.level_2;

class YearOfIssueSearchCriteria implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue().equals(yearOfIssueToSearch)) {
            return true;
        } else {
            return false;
        }
    }
}