package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

import student_josifs_makarenko.lesson11.BookDatabase.Book;

public class OrSearchCriteria extends SearchCriteriaSuper  implements  SearchCriteria{
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        super(new Paging(), SortingCriteria.NONE);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition, Paging paging) {
        super(paging, SortingCriteria.NONE);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public OrSearchCriteria(Paging paging, SortingCriteria searchCriteria, SearchCriteria leftCondition, SearchCriteria rightCondition) {
        super(paging, searchCriteria);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }
}
