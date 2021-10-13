package student_oleg_kozlov.lesson_11.level_6.UIAction;

import student_oleg_kozlov.lesson_11.level_3.Book;
import student_oleg_kozlov.lesson_11.level_3.BookDatabase;

import java.util.List;
import java.util.Map;

// Task_38
public class GetAuthorToBooksMapUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> result = bookDatabase.getAuthorToBooksMap();
        if (result.size() == 0) {
            System.out.println("No records to display.");
            return;
        }
        for (Map.Entry<String, List<Book>> entry : result.entrySet()) {
            System.out.println("*** Author = " + entry.getKey() + " ***");
            printBooksList(entry.getValue());
            System.out.println();
        }
    }

    private void printBooksList(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
