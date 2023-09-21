package student_alberts_matrozis.lesson_11.level_2.UIActions;

import student_alberts_matrozis.lesson_11.level_2.Book;
import student_alberts_matrozis.lesson_11.level_2.BookDatabase;
import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter book author: ");
        String author = s.nextLine();
        System.out.println("Enter book title: ");
        String title = s.nextLine();
        System.out.println("Enter year of issue: ");
        int yearOfIssue = s.nextInt();
        bookDatabase.save(new Book(author, title, String.valueOf(yearOfIssue)));
    }
}
