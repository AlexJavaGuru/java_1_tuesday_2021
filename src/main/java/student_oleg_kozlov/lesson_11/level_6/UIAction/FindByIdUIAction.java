package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

// Task_32
public class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.print("Book Id: ");
        Long id = 0L;
        try {
            id = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("Invalid Id is provided!");
            return;
        }
        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println("Found book: " + bookOpt.get());
        } else {
            System.out.println("Book not found.");
        }
    }
}
