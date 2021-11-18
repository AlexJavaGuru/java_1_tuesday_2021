package student_josifs_makarenko.lesson_9.level5;

import java.util.Arrays;

public class BookReaderDemo {
    public static void main(String[] args) {
     BookReaderImpl bookReader = new BookReaderImpl();

     Book book = new Book("Zhul Vern", "vokrug sveta za 80 dney");
     Book book2 = new Book("Dostoevskiy", "Idiot");
     Book book3 = new Book("Bulgakov", "Master i margarita");
     Book book1 = new Book(null, null);
     //bookReader.addBookToLibrary(book1);
     bookReader.addBookToLibrary(book2);
     bookReader.addBookToLibrary(book3);
     bookReader.addBookToLibrary(book);

     bookReader.showLibrary();

     bookReader.deleteBookFromLibrary(book2);

     bookReader.showLibrary();

     System.out.println(bookReader.markAsRead(book2));
     System.out.println(bookReader.markAsUnread(book3));

     bookReader.showReadBook();
     bookReader.showUnreadBook();

     System.out.println(Arrays.toString(bookReader.findByAuthor("Zhul")));
     System.out.println(Arrays.toString(bookReader.findByName("Master")));
    }
}
