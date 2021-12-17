package student_sergej_pereligin.lesson_11.level_2;

class AndSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        if (book.equals(leftCondition) && book.equals(rightCondition)) {
            return true;
        } else {
            return false;
        }
    }
}
