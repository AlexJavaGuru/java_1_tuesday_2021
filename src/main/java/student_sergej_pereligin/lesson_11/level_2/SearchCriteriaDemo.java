package student_sergej_pereligin.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

public class SearchCriteriaDemo {

    public static void main(String[] args) {

        List<Book> newBookList = new ArrayList<>();
        BookDatabase newBookDatabase = new BookDataBaseImpl(newBookList);

        Book book1 = new Book("Zveroboi", "Kuper", "1890");

        newBookDatabase.save(book1);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(orSearchCriteria.match(book1));

    }
}
