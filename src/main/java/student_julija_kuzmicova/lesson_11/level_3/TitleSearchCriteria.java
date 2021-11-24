package student_julija_kuzmicova.lesson_11.level_3;

//Task_17
public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if(book.getTitle().equals(titleToSearch)) {
            return true;
        }
        return false;
    }

}
