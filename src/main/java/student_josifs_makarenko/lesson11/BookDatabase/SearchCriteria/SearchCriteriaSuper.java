package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

public abstract class SearchCriteriaSuper {
    private Paging paging;
    private SortingCriteria sortingCriteria;

    public SearchCriteriaSuper(Paging paging, SortingCriteria searchCriteria) {
        this.paging = paging;
        this.sortingCriteria = searchCriteria;
    }

    public Paging getPaging() {
        return this.paging;
    }

    public SortingCriteria getSortingCriteria() {
        return sortingCriteria;
    }
}
