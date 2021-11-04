package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.Set;

// Task_38
public class FindUniqueBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<Book> result = bookDatabase.findUniqueBooks();
        if (result.size() > 0) {
            System.out.println("Unique books are:");
            for (Book book : result) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books to display");
        }
    }
}
