package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

// Task_38
public class DeleteByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        if (title.isBlank()) {
            System.out.println("Title is not provided!");
            return;
        }
        bookDatabase.deleteByTitle(title);
        System.out.println("All books with provided title have been deleted.");
    }
}
