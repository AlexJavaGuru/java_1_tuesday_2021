package student_josifs_makarenko.lesson11.BookDatabase.UIAction;

import student_josifs_makarenko.lesson11.BookDatabase.BookDatabase;

import java.util.Scanner;

public class FindByTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your title");
        System.out.println(bookDatabase.findByTitle(scanner.nextLine()));
    }
}
