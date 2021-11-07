package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

import student_josifs_makarenko.lesson11.BookDatabase.Book;

public class AuthorSearchCriteria extends SearchCriteriaSuper implements SearchCriteria{

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        super(new Paging(), SortingCriteria.NONE);
        this.authorToSearch = authorToSearch;
    }

    public AuthorSearchCriteria(String authorToSearch, Paging paging) {
        super(paging, SortingCriteria.NONE);
        this.authorToSearch = authorToSearch;
    }

    public AuthorSearchCriteria(String authorToSearch, Paging paging, SortingCriteria sortingCriteria) {
        super(paging, sortingCriteria);
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
