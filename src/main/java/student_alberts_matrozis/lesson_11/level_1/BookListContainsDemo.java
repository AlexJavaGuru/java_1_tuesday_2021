package student_alberts_matrozis.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book book3 = new Book("A3", "B3");
        System.out.println(books.contains(book1) + " | " + books.contains(book3));
    }
}
