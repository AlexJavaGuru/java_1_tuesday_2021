package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

// Task_38
public class DeleteByAuthorUIAction implements  UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.print("Author: ");
        String author = scanner.nextLine();
        if (author.isBlank()) {
            System.out.println("Author is not provided!");
            return;
        }
        bookDatabase.deleteByAuthor(author);
        System.out.println("All books for provided author have been deleted.");
    }
}
