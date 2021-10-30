package student_alberts_matrozis.lesson_11.level_2.UIActions;

import student_alberts_matrozis.lesson_11.level_2.Book;
import student_alberts_matrozis.lesson_11.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {


    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter author of book: ");
        List<Book> findedBooks = bookDatabase.findByAuthor(s.nextLine());
        System.out.println(findedBooks);
    }
}
