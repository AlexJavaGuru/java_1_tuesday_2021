package student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria;

import student_josifs_makarenko.lesson11.BookDatabase.Book;

public interface SearchCriteria {
    boolean match(Book book);

    Paging getPaging();

    SortingCriteria getSortingCriteria();
}
