package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Map;

//Task_38
public class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, Integer> result = bookDatabase.getEachAuthorBookCount();
        if(result.isEmpty()) {
            System.out.println("Records not found");
        } else {
            System.out.println("Unique authors are: ");
            for(Map.Entry<String, Integer> entry : result.entrySet()) {
                System.out.println(entry);
            }
        }
    }


}
