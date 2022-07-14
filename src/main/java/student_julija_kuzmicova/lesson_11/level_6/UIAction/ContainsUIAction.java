package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.Book;
import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Scanner;

//Task_38
public class ContainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
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
        if(bookDatabase.contains(book)) {
            System.out.println("Book exists in the library");
        } else {
            System.out.println("Book does not exists in the library");
        }
    }

}
