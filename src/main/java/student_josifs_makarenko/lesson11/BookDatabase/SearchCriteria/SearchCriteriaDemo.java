package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

import student_josifs_makarenko.lesson11.BookDatabase.Book;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book = new Book("Kuper", "Zveroboi", "1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi", new Paging());
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890", new Paging());
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria, new Paging());
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria, new Paging());
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria, new Paging(1, 2));
        SearchCriteria searchCriteria4 = new OrSearchCriteria(searchCriteria3, yearOfIssueSearchCriteria, new Paging(2, 1));

        System.out.println(searchCriteria1.match(book));
        System.out.println(searchCriteria2.match(book));
        System.out.println(searchCriteria4.match(book));
    }
}
