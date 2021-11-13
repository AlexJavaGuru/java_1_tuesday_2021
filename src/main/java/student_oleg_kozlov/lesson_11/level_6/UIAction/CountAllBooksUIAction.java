package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

// Task_38
public class CountAllBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Books quantity in the library: " + bookDatabase.countAllBooks());
    }
}
