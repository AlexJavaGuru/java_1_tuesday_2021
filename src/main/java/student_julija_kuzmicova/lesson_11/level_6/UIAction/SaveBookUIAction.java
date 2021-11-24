package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import student_julija_kuzmicova.lesson_11.level_3.Book;

import java.util.Scanner;

//Task_31
public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
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
        bookDatabase.save(book);
        System.out.println("Book (" + book.getAuthor() + ", " + book.getTitle() + ", " + book.getYearOfIssue()
                + ", " + book.getId() + ") has been successfully added to the library");
    }

}
