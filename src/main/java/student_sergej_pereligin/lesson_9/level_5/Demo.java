package student_sergej_pereligin.lesson_9.level_5;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Demo {

    public static void main(String[] args) {

        List<Book> books = initBooks();
        BookCollectionImpl bookCollectionimpl = new BookCollectionImpl(books);



//        bookCollectionimpl.addBook(book1);
//        bookCollectionimpl.addBook(book2);
//        bookCollectionimpl.addBook(book3);
//        bookCollectionimpl.addBook(book4);

        // bookCollectionimpl.deleteBook(book1);
//        bookCollectionimpl.deleteBook(book2);
//        bookCollectionimpl.deleteBook(book3);
//        bookCollectionimpl.deleteBook(book4);
//
        //System.out.println(.toString());

        // System.out.println(bookCollectionimpl.findByAuthor("Author1", book3));
        bookCollectionimpl.deleteBookByAuthor("Author1");

        Optional<Book> bookSearchResult = bookCollectionimpl.findByAuthor("Author1");
        if (bookSearchResult.isPresent()) {
            Book book = bookSearchResult.get();

        }


    }

    private static List<Book> initBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1"));
        books.add(new Book("Book2", "Author2"));
        books.add(new Book("Book3", "Author3"));
        books.add(new Book("Book4", ""));
        books.add(new Book("Book5", "Author1"));
        return books;
    }
}
