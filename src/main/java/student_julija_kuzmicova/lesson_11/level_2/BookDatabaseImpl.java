package student_julija_kuzmicova.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Task_6, Task_7, Task_8, Task_9, Task_10, Task_11, Task_12, Task_13, Task_14
class BookDatabaseImpl implements BookDatabase{

    private List<Book> bookList = new ArrayList<>();
    private long tempId = 0L;

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public Long save(Book book) {
        if(book == null) {
            return tempId;
        }
        bookList.add(book);
        book.setId(++tempId);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for(Book book : bookList) {
            if(book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for(Book b : bookList) {
            if(b.equals(book)) {
                bookList.remove(b);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for(Book book : bookList) {
            if(book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> bookForDelete = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getAuthor().equals(author)) {
                bookForDelete.add(book);
            }
        }
        for(Book book : bookForDelete) {
            bookList.remove(book);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> bookForDelete = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getTitle().equals(title)) {
                bookForDelete.add(book);
            }
        }
        for(Book book : bookForDelete) {
            bookList.remove(book);
        }
    }
}
