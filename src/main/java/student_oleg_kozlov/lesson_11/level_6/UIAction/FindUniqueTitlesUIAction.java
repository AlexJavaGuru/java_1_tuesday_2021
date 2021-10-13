package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Set;

// Task_38
public class FindUniqueTitlesUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> result = bookDatabase.findUniqueTitles();
        if (result.size() > 0) {
            System.out.println("Unique titles are:");
            for (String s : result) {
                System.out.println(s);
            }
        } else {
            System.out.println("No titles to display");
        }
    }
}
