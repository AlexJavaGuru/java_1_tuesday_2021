package student_alberts_matrozis.lesson_11.level_2.UIActions;

import student_alberts_matrozis.lesson_11.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {


    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter title: ");
        bookDatabase.deleteByTitle(s.nextLine());
    }
}
