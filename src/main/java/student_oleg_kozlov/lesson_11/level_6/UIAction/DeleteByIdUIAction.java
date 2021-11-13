package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

// Task_35
public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.print("Book Id to delete: ");
        Long id = 0L;
        try {
            id = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("Invalid Id is provided!");
            return;
        }
        boolean result = bookDatabase.delete(id);
        if (result) {
            System.out.println("Book has been deleted.");
        } else {
            System.out.println("Book has not been deleted.");
        }
    }
}
