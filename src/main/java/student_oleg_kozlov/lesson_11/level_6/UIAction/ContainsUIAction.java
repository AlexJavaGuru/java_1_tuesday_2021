package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

// Task_38
public class ContainsUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Book to find");
        String title, author, yearOfIssue;
        System.out.print("Book title: ");
        title = scanner.nextLine();
        System.out.print("Book author: ");
        author = scanner.nextLine();
        System.out.print("Book year of issue: ");
        yearOfIssue = scanner.nextLine();
        if (title.isBlank() || author.isBlank() || yearOfIssue.isBlank()) {
            System.out.println("Not all data provided!");
            return;
        }
        Book book = new Book(title, author, yearOfIssue);
        boolean result = bookDatabase.contains(book);
        if (result) {
            System.out.println("This Book exists in the library.");
        } else {
            System.out.println("This Book does not exist in the library");
        }
    }
}
