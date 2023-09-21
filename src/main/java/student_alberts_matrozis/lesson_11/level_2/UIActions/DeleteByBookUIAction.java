package student_alberts_matrozis.lesson_11.level_2.UIActions;

import student_alberts_matrozis.lesson_11.level_2.Book;
import student_alberts_matrozis.lesson_11.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByBookUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter author of book: ");
        String author = s.nextLine();
        System.out.println("Enter title of book: ");
        String title = s.nextLine();
        System.out.println("Enter year of issue: ");
        String yearOfIssue = s.nextLine();
        bookDatabase.delete(new Book(author, title, yearOfIssue));
    }
}
