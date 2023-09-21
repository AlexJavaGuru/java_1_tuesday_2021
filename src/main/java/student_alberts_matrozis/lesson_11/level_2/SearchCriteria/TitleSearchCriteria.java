package student_alberts_matrozis.lesson_11.level_2.SearchCriteria;

import student_alberts_matrozis.lesson_11.level_2.Book;

public class TitleSearchCriteria implements SearchCriteria {
    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
