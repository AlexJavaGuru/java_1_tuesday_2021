package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.BookDatabase;

import java.util.Set;

//Task_38
public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> result = bookDatabase.findUniqueAuthors();
        if(result.isEmpty()) {
            System.out.println("Authors not found");
        } else {
            System.out.println("Unique authors are: ");
            for(String string : result) {
                System.out.println(string);
            }
        }
    }

}
