package student_alberts_matrozis.lesson_11.level_2.SearchCriteria;

import student_alberts_matrozis.lesson_11.level_2.Book;

class AuthorSearchCriteria implements SearchCriteria {
    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }


}
