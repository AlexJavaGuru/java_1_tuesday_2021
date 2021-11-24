package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.Book;
import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

//Task_38
public class DeleteByBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a book author...");
        String author = scanner.nextLine();
        System.out.println("Please enter a book title...");
        String title = scanner.nextLine();
        System.out.println("Please enter a book year of issue...");
        String yearOfIssue = scanner.nextLine();
        if(author.isBlank() || title.isBlank() || yearOfIssue.isBlank()) {
            System.out.println("Please enter correct data");
            return;
        }
        Book book = new Book(author, title, yearOfIssue);
        if(bookDatabase.delete(book)) {
            System.out.println("Book deleted");
        } else {
            System.out.println("Book not deleted");
        }
    }

}
