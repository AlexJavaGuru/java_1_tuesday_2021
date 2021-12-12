package student_alberts_matrozis.lesson_11.level_2.UIActions;

import student_alberts_matrozis.lesson_11.level_2.BookDatabase;

public class FindUniqueTitlesUIAction implements UIAction {


    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.findUniqueTitles());
    }
}
