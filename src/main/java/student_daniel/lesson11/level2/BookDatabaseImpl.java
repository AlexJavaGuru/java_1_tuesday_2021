package student_daniel.lesson11.level2;

import java.util.LinkedList;
import java.util.List;

public class BookDatabaseImpl {
    static void main(String[] args) {
        List<Book> allBooks = new LinkedList<>();

        Book book1 = new Book(1L,"Title1", "Daniel");
        Book book2 = new Book(2L,"Title2", "Ben");
        Book book3 = new Book(3L,"Title1", "Alex");
        Book book4 = new Book(4L,"Title1", "Daniel");
        Book book5 = new Book(5L,"Title2", "Daniel");
        Book book6 = new Book(6L,"Title1", "Mark");
        Book book7 = new Book(7L,"Title3", "Bob");
        Book book8 = new Book(8L,"Title3", "July");

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);
        allBooks.add(book6);
        allBooks.add(book7);
        allBooks.add(book8);

        for (int i = 0; i < allBooks.size(); i++) {
            System.out.println(allBooks.get(i));
        }

        System.out.println(allBooks.size());

    }
}
