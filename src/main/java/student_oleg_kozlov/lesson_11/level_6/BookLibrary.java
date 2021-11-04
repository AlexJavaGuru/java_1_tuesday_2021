package student_oleg_kozlov.lesson_11.level_6;

import student_oleg_kozlov.lesson_11.level_3.BookDatabase;
import student_oleg_kozlov.lesson_11.level_3.BookDatabaseImpl;
import student_oleg_kozlov.lesson_11.level_6.UIAction.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Task_36, Task_38
class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetEachAuthorBookCountUIAction(bookDatabase));
        menuNumberToActionMap.put(16, new FindUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("0 - Exit");
            System.out.println("1 - Save book");
            System.out.println("2 - Find book by id");
            System.out.println("3 - Find book by author");
            System.out.println("4 - Find book by title");
            System.out.println("5 - Delete book by id");
            System.out.println("6 - Delete book by book");
            System.out.println("7 - Books quantity in the library");
            System.out.println("8 - Delete all books for author");
            System.out.println("9 - Delete all books with title");
            System.out.println("10 - List out all unique authors");
            System.out.println("11 - List out all unique titles");
            System.out.println("12 - List out all unique books");
            System.out.println("13 - Check book existence in the library");
            System.out.println("14 - List out books by author");
            System.out.println("15 - List out each author books quantity");
            System.out.println("16 - Find books by search criteria");
            System.out.print("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
