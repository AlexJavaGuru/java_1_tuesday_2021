package student_julija_kuzmicova.lesson_11.level_6.UIAction;

import student_julija_kuzmicova.lesson_11.level_3.*;

import java.util.List;
import java.util.Scanner;

//Task_38
public class FindByCriteriaUIAction implements UIAction {

    private BookDatabase bookDatabase;

    Scanner scanner = new Scanner(System.in);

    public FindByCriteriaUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        List<Book> list = bookDatabase.find(searchCriteriaConstructor());
        if(list.isEmpty()) {
            System.out.println("Books not found");
        } else {
            for(Book book : list) {
                System.out.println(book);
            }
        }
    }

    private void searchCriteriaMenu() {
        System.out.println("Please select search criteria:");
        System.out.println("1 - Search by author");
        System.out.println("2 - Search by title");
        System.out.println("3 - Search by year of issue");
    }

    private void searchOperatorMenu() {
        System.out.println("Please select search operator:");
        System.out.println("1 - AND");
        System.out.println("2 - OR");
    }

    private int checkCriteriaInput() {
        int userInput;
        while(true) {
            searchCriteriaMenu();
            userInput = scanner.nextInt();
            if(userInput < 1 || userInput > 3) {
                System.out.println("Incorrect choice. Try again");
                continue;
            }
            break;
        }
        return userInput;
    }

    private SearchCriteria getSearchCriteria(int searchInput, String text) {
        SearchCriteria searchCriteria = null;
        if(searchInput == 1) {
            searchCriteria = new AuthorSearchCriteria(text);
        } else if(searchInput == 2) {
            searchCriteria = new TitleSearchCriteria(text);
        } else {
            searchCriteria = new YearOfIssueSearchCriteria(text);
        }
        return searchCriteria;
    }

    private int checkOperatorInput() {
        int userInput;
        while(true) {
            searchOperatorMenu();
            userInput = scanner.nextInt();
            if(userInput < 1 || userInput > 2) {
                System.out.println("Incorrect choice. Try again");
                continue;
            }
            break;
        }
        return userInput;
    }

    private SearchCriteria getSearchOperator(int searchInput, SearchCriteria leftCondition, SearchCriteria rightCondition) {
        SearchCriteria searchCriteria = null;
        if(searchInput == 1) {
            searchCriteria = new AndSearchCriteria(leftCondition, rightCondition);
        } else {
            searchCriteria = new OrSearchCriteria(leftCondition, rightCondition);
        }
        return searchCriteria;
    }

    private SearchCriteria searchCriteriaConstructor() {
        SearchCriteria searchCriteria = null;
        int userInput;
        userInput = checkCriteriaInput();
        System.out.println("Please enter search value...");
        SearchCriteria leftCondition = getSearchCriteria(userInput, scanner.next());
        userInput = checkCriteriaInput();
        System.out.println("Please enter search value...");
        SearchCriteria rightCondition = getSearchCriteria(userInput, scanner.next());
        userInput = checkOperatorInput();
        searchCriteria = getSearchOperator(userInput, leftCondition, rightCondition);
        return searchCriteria;
    }
}
