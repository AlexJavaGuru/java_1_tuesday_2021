package student_oleg_kozlov.lesson_11.level_3;

// Task_39, Task_40
abstract class SearchCriteriaSuper {
    private Paging paging;
    private SortingType sortingType;

    public SearchCriteriaSuper(Paging paging, SortingType sortingType) {
        this.paging = paging;
        this.sortingType = sortingType;
    }

    public Paging getPaging() {
        return this.paging;
    }

    public SortingType getSortingType() {
        return sortingType;
    }
}
