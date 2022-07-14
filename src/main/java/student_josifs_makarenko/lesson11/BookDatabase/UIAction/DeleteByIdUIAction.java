package student_josifs_makarenko.lesson11.BookDatabase.UIAction;

import student_josifs_makarenko.lesson11.BookDatabase.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input id (long)");

        bookDatabase.delete(scanner.nextLong());
    }
}
