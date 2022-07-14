package student_julija_kuzmicova.lesson_11.level_3;

//Task_16
public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if(book.getAuthor().equals(authorToSearch)) {
            return true;
        }
        return false;
    }

}
