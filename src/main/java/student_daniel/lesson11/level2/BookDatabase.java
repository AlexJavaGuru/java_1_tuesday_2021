package student_daniel.lesson11.level2;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);
    boolean delete(Long bookId);

    List<Book> books = null;
    default Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }



    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);

    int countAllBooks();

    default void deleteByAuthor(String author){
//        String selectedAuthor = author.getAuthor();
//        if(selectedAuthor == author){
//            allBooks.removeAll(selectedAuthor);
//            System.out.println("Author found, all record for this author are deleted");
//        } else {
//            System.out.println("Author not found, nothing to delete");
//        }
    }

    default void deleteByTitle(String title) {
//        String selectedATitle = title.getTitle();
//        allBooks.removeAll(selectedATitle);
    }


}
