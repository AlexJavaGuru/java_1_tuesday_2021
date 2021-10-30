package student_alberts_matrozis.lesson_11.level_2.SearchCriteria;

import student_alberts_matrozis.lesson_11.level_2.Book;

public class OrSearchCriteria implements SearchCriteria {
    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }
}
