package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.Book;
import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.List;
import java.util.Scanner;

//Task_34
public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title...");
        String title = scanner.nextLine();
        List<Book> list = bookDatabase.findByTitle(title);
        if(list.isEmpty()) {
            System.out.println("Books not found");
        } else {
            for(Book book : list) {
                System.out.println(book);
            }
        }
    }

}
