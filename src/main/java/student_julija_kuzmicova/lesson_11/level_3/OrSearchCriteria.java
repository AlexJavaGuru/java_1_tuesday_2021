package student_julija_kuzmicova.lesson_11.level_3;

//Task_20
public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if(leftCondition.match(book) || rightCondition.match(book)) {
            return true;
        }
        return false;
    }

}
