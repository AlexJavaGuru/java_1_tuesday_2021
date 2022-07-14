package student_josifs_makarenko.lesson11.BookDatabase;

import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.AuthorSearchCriteria;

public class BookDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Lem", "Edem", "1");
        Book book2 = new Book("Gogol", "Nos", "1");
        Book book3 = new Book("Lermontov", "Gerot nashego vremeni 1", "1");
        Book book4 = new Book("Lermontov", "Gerot nashego vremeni 2", "1");
        Book book5 = new Book("Lermontov", "Gerot nashego vremeni 3", "1");
        Book book6 = new Book("Lermontov", "Gerot nashego vremeni 3", "1");

        bookDatabase.save(book1);
        bookDatabase.save(book1);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        bookDatabase.showBookDatabase();

        bookDatabase.contains(book6);

        System.out.println(bookDatabase.getEachAuthorBookCount());

        System.out.println(bookDatabase.findUniqueBooks());

        System.out.println(bookDatabase.find(new AuthorSearchCriteria("Lermontov")));

//        System.out.println(bookDatabase.countAllBooks());
//
//        System.out.println(bookDatabase.findUniqueAuthors());
//
//        System.out.println(bookDatabase.find(new AuthorSearchCriteria("Lermontov")));
//
//        bookDatabase.deleteByAuthor("Lermontov");
//
//        System.out.println(bookDatabase.findByAuthor("Lermontov"));
//        System.out.println(bookDatabase.findByTitle("Gerot"));
//
//        System.out.println(bookDatabase.findById(1L));
//
//        bookDatabase.showBookDatabase();
//
//        System.out.println(bookDatabase.delete(1L));
//
//        bookDatabase.showBookDatabase();
//
//        System.out.println(bookDatabase.delete(book2));
//
//        bookDatabase.showBookDatabase();
    }
}
