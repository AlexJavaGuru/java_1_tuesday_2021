package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;
import student_julija_kuzmicova.lesson_11.level_3.Book;

import java.util.Optional;
import java.util.Scanner;

//Task_32
public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book ID...");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        if(bookOpt.isEmpty()) {
            System.out.println("Book not found");
        } else {
            System.out.println(bookOpt.get());
        }
    }

}
