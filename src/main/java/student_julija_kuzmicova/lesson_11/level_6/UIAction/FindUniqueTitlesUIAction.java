package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Set;

//Task_38
public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> result = bookDatabase.findUniqueTitles();
        if(result.isEmpty()) {
            System.out.println("Titles not found");
        } else {
            System.out.println("Unique titles are: ");
            for(String string : result) {
                System.out.println(string);
            }
        }
    }

}
