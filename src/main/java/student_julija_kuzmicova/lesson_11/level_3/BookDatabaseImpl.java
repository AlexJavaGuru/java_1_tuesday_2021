package student_julija_kuzmicova.lesson_11.level_3;

import java.util.*;

//Task_22, Task_23, Task_24, Task_25, Task_26, Task_28, Task_29
public class BookDatabaseImpl implements BookDatabase {

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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        for(Book book : bookList) {
            if(searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> result = new HashSet<>();
        for(Book book : bookList) {
            result.add(book.getAuthor());
        }
        return result;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> result = new HashSet<>();
        for(Book book : bookList) {
            result.add(book.getTitle());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> result = new HashSet<>();
        for(Book book : bookList) {
            result.add(book);
        }
        return result;
    }

    @Override
    public boolean contains(Book book) {
        for(Book b : bookList) {
            if(book.equals(b)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> result = new HashMap<>();
        Set<String> uniqueAuthor = findUniqueAuthors();
        for(String author : uniqueAuthor) {
            result.put(author, findByAuthor(author));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> result = new HashMap<>();
        Map<String, List<Book>> uniqueAuthorsToBooks = getAuthorToBooksMap();
        for(String author : uniqueAuthorsToBooks.keySet()) {
            result.put(author, uniqueAuthorsToBooks.get(author).size());
        }
        return result;
    }
}
