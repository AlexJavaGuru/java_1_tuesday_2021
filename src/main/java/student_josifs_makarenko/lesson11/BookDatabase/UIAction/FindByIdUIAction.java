package student_josifs_makarenko.lesson11.BookDatabase.UIAction;

import student_josifs_makarenko.lesson11.BookDatabase.Book;
import student_josifs_makarenko.lesson11.BookDatabase.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input id");
        Optional<Book> bookOpt = bookDatabase.findById(scanner.nextLong());
        System.out.println(bookOpt);
    }
}
