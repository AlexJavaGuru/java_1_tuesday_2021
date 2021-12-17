package student_sergej_pereligin.lesson_11.level_2;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getAuthor().equals(authorToSearch)) {
            return true;
        } else {
            return false;
        }
    }
}