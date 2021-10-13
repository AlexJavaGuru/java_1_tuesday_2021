package student_oleg_kozlov.lesson_11.level_3;

import java.util.*;

// Task_22, Task_23, Task_24, Task_25, Task_26, Task_28, Task_29, Task_39, Task_40
public class BookDatabaseImpl implements BookDatabase {
    private List<Book> books;
    private static long currentId;

    public List<Book> getBooks() {
        return books;
    }

    public BookDatabaseImpl() {
        books = new ArrayList<>();
        currentId = 0L;
    }

    @Override
    public Long save(Book book) {
        if (book == null) {
            return 0L;
        }
        book.setId(++currentId);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        Book bookToDelete = null;
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                bookToDelete = book;
                break;
            }
        }
        return books.remove(bookToDelete);
    }

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksToDelete = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksToDelete.add(book);
            }
        }
        if (booksToDelete.size() > 0) {
            for (Book book : booksToDelete) {
                books.remove(book);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> booksToDelete = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksToDelete.add(book);
            }
        }
        if (booksToDelete.size() > 0) {
            for (Book book : booksToDelete) {
                books.remove(book);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchResult = new LinkedList<>();
        if (searchCriteria == null) {
            return searchResult;
        }
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                searchResult.add(book);
            }
        }
        doSorting(searchResult, searchCriteria.getSortingType());
        return doPaging(searchResult, searchCriteria.getPaging()) ;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> result = new HashSet<>();
        for (Book book : books) {
            result.add(book.getAuthor());
        }
        return result;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> result = new HashSet<>();
        for (Book book : books) {
            result.add(book.getTitle());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> result = new HashSet<>();
        for (Book book : books) {
            result.add(book);
        }
        return result;
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> result = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();
        for (String author : uniqueAuthors) {
            result.put(author, findByAuthor(author));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> result = new HashMap<>();
        Map<String, List<Book>> authorToBooks = getAuthorToBooksMap();
        for (Map.Entry<String, List<Book>> entry : authorToBooks.entrySet()) {
            result.put(entry.getKey(), countUniqueBooks(entry.getValue()));
        }
        return result;
    }

    private Integer countUniqueBooks(List<Book> bookList) {
        if (bookList == null) {
            return 0;
        }
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : bookList) {
            uniqueBooks.add(book);
        }
        return uniqueBooks.size();
    }

    private List<Book> doPaging(List<Book> list, Paging paging) {
        if (paging.getItemsOnPage() == 0) {
            return list;
        }
        int fromIndex = (paging.getPageToShow() - 1) * paging.getItemsOnPage();
        int toIndex = fromIndex + paging.getItemsOnPage();

        if (toIndex > list.size()) {
            toIndex = list.size();
        }

        if (fromIndex > toIndex) {
            fromIndex = toIndex;
        }

        return list.subList(fromIndex, toIndex);
    }

    private void doSorting(List<Book> list, SortingType type) {
        if (type == SortingType.NONE) {
            return;
        }
        Collections.sort(list);
        if (type == SortingType.DESC) {
            Collections.reverse(list);
        }
    }
}
