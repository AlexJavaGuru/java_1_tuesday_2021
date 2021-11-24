package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

//Task_38
public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title...");
        String title = scanner.nextLine();
        if(title.isBlank()) {
            System.out.println("Please enter correct data...");
            return;
        }
        bookDatabase.deleteByTitle(title);
        System.out.println("Book deleted");
    }

}
