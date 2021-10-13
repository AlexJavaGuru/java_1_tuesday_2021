package student_oleg_kozlov.lesson_11.level_3;

// Task_17, Task_39, Task_40
public class TitleSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        super(new Paging(), SortingType.NONE);
        this.titleToSearch = titleToSearch;
    }

    public TitleSearchCriteria(String titleToSearch, Paging paging) {
        super(paging, SortingType.NONE);
        this.titleToSearch = titleToSearch;
    }

    public TitleSearchCriteria(String titleToSearch, Paging paging, SortingType sortingType) {
        super(paging, sortingType);
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book != null && book.getTitle().equals(this.titleToSearch);
    }
}
