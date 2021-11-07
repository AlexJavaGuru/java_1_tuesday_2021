package student_josifs_makarenko.lesson11.BookDatabase;

import student_josifs_makarenko.lesson11.BookDatabase.SearchCriteria.SearchCriteria;

import java.util.*;
import java.util.stream.Collectors;

public class BookDatabaseImpl implements BookDatabase{
    Map<Long, Book> library = new HashMap<>();


    @Override
    public Long save(Book book) {
        book.setId((long) library.size() + 1);
        library.put(book.getId(), book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Long aLong : library.keySet()) {
            if (bookId.equals(aLong)) {
                library.remove(bookId);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book value : library.values()) {
            if (value.equals(book)) {
                library.remove(book.getId());
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Long aLong : library.keySet()) {
            if (bookId.equals(aLong)) {
                return Optional.of(library.get(aLong));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : library.values()) {
            if (book.getAuthor().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : library.values()) {
            if (book.getTitle().contains(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return library.size();
    }

    @Override
    public void showBookDatabase() {
        System.out.println(library);
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> result = new HashSet<>();
        for (Book value : library.values()) {
            result.add(value.getTitle());
        }
        return result;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> result = new HashSet<>();
        for (Book value : library.values()) {
            result.add(value.getAuthor());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(library.values());
    }

    @Override
    public boolean contains(Book book) {
        for (Book value : library.values()) {
            if (value.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return library.values().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, List<Book>> temp = getAuthorToBooksMap();
        Map<String, Integer> result = new HashMap<>();

        String[] authors = temp.keySet().toArray(new String[0]);
        List<Integer> counts = new ArrayList<>();


        for (List<Book> value : temp.values()) {
            counts.add(value.size());
        }

        for (int i = 0; i < temp.size(); i++) {
            result.put(authors[i], counts.get(i));
        }

        return result;
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> result = findByAuthor(author);

        for (Book book : result) {
            if (book.getAuthor().equals(author)) {
                library.remove(book.getId());
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> result = findByTitle(title);

        for (Book book : result) {
            if (book.getTitle().equals(title)) {
                library.remove(book.getId());
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {

        List<Book> result = new ArrayList<>();

        for (Book book : library.values()) {
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }


}
