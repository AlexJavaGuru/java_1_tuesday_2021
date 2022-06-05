package student_daniel.lesson11.level2_3_4;

class AndSearchCriteria extends BookDatabaseImpl implements SearchCriteria {
    //Task 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }
}