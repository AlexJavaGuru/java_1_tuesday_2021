package student_oleg_kozlov.lesson_11.level_3;

// Task_21
class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book bookToSearch = new Book("Zveroboi", "Kuper", "1890");
        boolean searchResult;
        SearchCriteria authorSearchCriteria, titleSearchCriteria, yearOfIssueSearchCriteria, searchCriteria,
                searchCriteriaBlock;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Книга для поиска: " + bookToSearch);
        System.out.println("-----------------------------------------------------------------------------------------");

        authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        searchResult = searchCriteria.match(bookToSearch);
        System.out.println("Критерий: автор книги \"Kuper\" и название \"Zveroboi\"");
        System.out.println("Результат поиска: " + ((searchResult) ? "найдена" : "не найдена"));
        System.out.println();

        authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        searchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        searchResult = searchCriteria.match(bookToSearch);
        System.out.println("Критерий: автор книги \"Kuper\" и год выпуска 1890");
        System.out.println("Результат поиска: " + ((searchResult) ? "найдена" : "не найдена"));
        System.out.println();

        authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        searchCriteriaBlock = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        searchCriteria = new OrSearchCriteria(searchCriteriaBlock, titleSearchCriteria);
        searchResult = searchCriteria.match(bookToSearch);
        System.out.println("Критерий: автор книги \"Kuper\" или год выпуска 1890 или название \"Zveroboi\"");
        System.out.println("Результат поиска: " + ((searchResult) ? "найдена" : "не найдена"));
    }
}
