package student_sergej_pereligin.lesson_11.level_2;

class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
      this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getTitle().equals(titleToSearch)) {
            return true;
        } else {
            return false;
        }
    }
}