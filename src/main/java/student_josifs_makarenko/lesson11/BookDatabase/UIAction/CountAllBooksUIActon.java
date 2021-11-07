package student_josifs_makarenko.lesson11.BookDatabase.UIAction;

import student_josifs_makarenko.lesson11.BookDatabase.BookDatabase;

public class CountAllBooksUIActon implements UIAction{
    private BookDatabase bookDatabase;

    public CountAllBooksUIActon(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println(bookDatabase.countAllBooks());
    }
}
