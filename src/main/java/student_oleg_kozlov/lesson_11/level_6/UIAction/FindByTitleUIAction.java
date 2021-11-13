package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.List;
import java.util.Scanner;

// Task_34
public class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public FindByTitleUIAction(BookDatabase bookDatabase) {
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
        List<Book> books = bookDatabase.findByTitle(title);
        if (books.size() == 0) {
            System.out.println("Books not found for provided title.");
        } else {
            System.out.println("The following books have been found for provided title:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
