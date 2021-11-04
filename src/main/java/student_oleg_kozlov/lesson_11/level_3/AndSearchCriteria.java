package student_oleg_kozlov.lesson_11.level_3;

// Task_19, Task_39, Task_40
public class AndSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        super(new Paging(), SortingType.NONE);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition, Paging paging) {
        super(paging, SortingType.NONE);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition, Paging paging, SortingType sortingType) {
        super(paging, sortingType);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return book != null && this.leftCondition.match(book) && this.rightCondition.match(book);
    }
}
