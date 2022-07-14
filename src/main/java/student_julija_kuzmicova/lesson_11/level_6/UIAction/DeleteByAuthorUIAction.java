package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

//Task_38
public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author...");
        String author = scanner.nextLine();
        if(author.isBlank()) {
            System.out.println("Please enter correct data...");
            return;
        }
        bookDatabase.deleteByAuthor(author);
        System.out.println("Book deleted");
    }

}
