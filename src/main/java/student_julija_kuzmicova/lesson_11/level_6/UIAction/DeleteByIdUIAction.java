package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

//Task_35
public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book ID...");
        Long id = scanner.nextLong();
        if(bookDatabase.delete(id)) {
            System.out.println("Book deleted");
        } else {
            System.out.println("Book not deleted");
        }
    }

}
