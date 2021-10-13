package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.List;
import java.util.Scanner;

// Task_33
public class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
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
        List<Book> books = bookDatabase.findByAuthor(author);
        if (books.size() == 0) {
            System.out.println("Books not found for provided author.");
        } else {
            System.out.println("The following books have been found for provided author:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
