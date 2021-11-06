package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

// Task_31
public class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);


    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
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
        Long id = bookDatabase.save(book);
        if (id > 0) {
            System.out.println("Book has been added with Id = " + id);
        } else {
            System.out.println("Book has not been created.");
        }
    }
}
