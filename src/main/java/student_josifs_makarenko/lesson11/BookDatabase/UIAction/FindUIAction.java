package student_josifs_makarenko.lesson11.BookDatabase.UIAction;

import student_josifs_makarenko.lesson11.BookDatabase.Book;
import student_josifs_makarenko.lesson11.BookDatabase.BookDatabase;
import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.*;

import java.util.List;
import java.util.Scanner;

public class FindUIAction implements  UIAction{
    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System. in);

    private enum MenuType {NODE, VALUE, OPERATOR};
    private enum OperationType {AND, OR, EMPTY};

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        List<Book> books = bookDatabase.find(constructCriteria());
        if (books.size() == 0) {
            System.out.println("Books not found");
            return;
        }
        System.out.println("Found books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private SearchCriteria constructCriteria() {
        int menuChoice;
        OperationType operationType = OperationType.EMPTY;
        SearchCriteria criteria = null;
        SearchCriteria newNode;
        while (true) {
            printMenu(MenuType.NODE);
            menuChoice = getMenuChoice();
            if (menuChoice == 0) {
                criteria = null;
                break;
            }
            printMenu(MenuType.VALUE);
            newNode = constructNodeWithValue(menuChoice, scanner.nextLine());
            criteria = combineCriteria(operationType, criteria, newNode);
            printMenu(MenuType.OPERATOR);
            menuChoice = getMenuChoice();
            if (menuChoice == 0) {
                criteria = null;
                break;
            } else if (menuChoice == 3) {
                break;
            } else if (menuChoice == 1) {
                operationType = OperationType.AND;
            } else {
                operationType = OperationType.OR;
            }
        }
        return criteria;
    }

    private void printMenu(MenuType type) {
        System.out.println();
        switch (type) {
            case NODE:
                System.out.println("Select a node for query");
                System.out.println("0 - Cancel search");
                System.out.println("1 - Title");
                System.out.println("2 - Author");
                System.out.println("3 - Year Of Issue");
                System.out.print("Your choice: ");
                break;
            case VALUE:
                System.out.print("Value for the node to search by: ");
                break;
            case OPERATOR:
                System.out.println("Select an operator for query");
                System.out.println("0 - Cancel search");
                System.out.println("1 - AND");
                System.out.println("2 - OR");
                System.out.println("3 - Execute query");
                System.out.print("Your choice: ");
                break;
            default:
                break;
        }
    }

    private int getMenuChoice() {
        int result;
        try {
            result = Integer.parseInt(scanner.nextLine());
        } catch (RuntimeException e) {
            return 0;
        }
        if (result < 1 || result > 3) {
            return 0;
        }
        return result;
    }

    private SearchCriteria constructNodeWithValue(int nodeType, String value) {
        if (nodeType == 1) {
            return new TitleSearchCriteria(value);
        } else if (nodeType == 2) {
            return new AuthorSearchCriteria(value);
        }
        else {
            return new YearOfIssueSearchCriteria(value);
        }
    }

    private SearchCriteria combineCriteria(OperationType operation, SearchCriteria existed, SearchCriteria addition) {
        if (operation == OperationType.EMPTY) {
            return addition;
        } else if (operation == OperationType.OR) {
            return new OrSearchCriteria(existed, addition);
        } else {
            return new AndSearchCriteria(existed, addition);
        }
    }
}
