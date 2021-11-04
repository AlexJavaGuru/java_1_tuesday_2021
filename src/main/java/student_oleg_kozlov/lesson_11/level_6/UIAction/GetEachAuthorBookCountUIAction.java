package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Map;

// Task_38
public class GetEachAuthorBookCountUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> result = bookDatabase.getEachAuthorBookCount();
        if (result.size() == 0) {
            System.out.println("No records to display.");
            return;
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Author = " + entry.getKey() + " Books = " + entry.getValue());
        }
    }
}
