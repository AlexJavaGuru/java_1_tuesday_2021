package student_josifs_makarenko.lesson11.BookDatabase.UIAction;

import student_josifs_makarenko.lesson11.BookDatabase.Book;
import student_josifs_makarenko.lesson11.BookDatabase.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input information about book (author, title, year of release)");

        Book book = new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        bookDatabase.save(book);
    }
}
