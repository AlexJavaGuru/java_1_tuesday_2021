package student_julija_kuzmicova.lesson_11.level_3;

//Task_21
class SearchCriteriaDemo {

    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria;
        SearchCriteria titleSearchCriteria;
        SearchCriteria yearOfIssueSearchCriteria;
        SearchCriteria searchCriteria;
        SearchCriteria searchCriteriaAuthorYear;

        authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        searchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        searchCriteriaAuthorYear = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        searchCriteria = new OrSearchCriteria(searchCriteriaAuthorYear, titleSearchCriteria);
    }
}
