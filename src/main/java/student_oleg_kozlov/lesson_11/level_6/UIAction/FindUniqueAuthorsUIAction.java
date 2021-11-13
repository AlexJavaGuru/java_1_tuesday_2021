package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Set;

// Task_38
public class FindUniqueAuthorsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> result = bookDatabase.findUniqueAuthors();
        if (result.size() > 0) {
            System.out.println("Unique authors are:");
            for (String s : result) {
                System.out.println(s);
            }
        } else {
            System.out.println("No authors to display");
        }
    }
}
