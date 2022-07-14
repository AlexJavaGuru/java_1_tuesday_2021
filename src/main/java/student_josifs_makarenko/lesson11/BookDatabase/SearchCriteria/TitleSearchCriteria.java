package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

import student_josifs_makarenko.lesson11.BookDatabase.Book;

public class TitleSearchCriteria extends SearchCriteriaSuper implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        super(new Paging(), SortingCriteria.NONE);
        this.titleToSearch = titleToSearch;
    }

    public TitleSearchCriteria(String titleToSearch, Paging paging) {
        super(paging, SortingCriteria.NONE);
        this.titleToSearch = titleToSearch;
    }

    public TitleSearchCriteria(Paging paging, SortingCriteria searchCriteria, String titleToSearch) {
        super(paging, searchCriteria);
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}