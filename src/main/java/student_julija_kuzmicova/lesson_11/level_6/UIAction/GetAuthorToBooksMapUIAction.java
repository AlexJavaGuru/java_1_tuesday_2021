package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.Book;
import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.List;
import java.util.Map;

//Task_38
public class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, List<Book>> result = bookDatabase.getAuthorToBooksMap();
        if(result.isEmpty()) {
            System.out.println("Records not found");
        } else {
            System.out.println("Unique authors are: ");
            for(Map.Entry<String, List<Book>> entry : result.entrySet()) {
                System.out.println(entry);
            }
        }
    }

}
