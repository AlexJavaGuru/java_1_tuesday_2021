package student_oleg_kozlov.lesson_11.level_3;

// Task_16, Task_39, Task_40
public class AuthorSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        super(new Paging(), SortingType.NONE);
        this.authorToSearch = authorToSearch;
    }

    public AuthorSearchCriteria(String authorToSearch, Paging paging) {
        super(paging, SortingType.NONE);
        this.authorToSearch = authorToSearch;
    }

    public AuthorSearchCriteria(String authorToSearch, Paging paging, SortingType sortingType) {
        super(paging, sortingType);
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book != null && book.getAuthor().equals(this.authorToSearch);
    }
}
