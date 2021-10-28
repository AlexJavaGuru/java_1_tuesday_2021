package student_julija_kuzmicova.lesson_9.level_5;

import java.util.Arrays;

//Task_13, Task_14, Task_15, Task_16, Task_17, Task_18, Task_19, Task_20, Task_21, Task_22, Task_23, Task_24
class BookReaderImpl implements BookReader {

    Book[] books = new Book[0];

    @Override
    public boolean isBookAdded(Book book) {
        if (!isBookValid(book)) {
            return false;
        }

        if (isBookDuplicate(book)) {
            return false;
        }

        Book[] newBooks = new Book[books.length + 1];
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        books = newBooks;
        books[books.length - 1] = book;
        return true;
    }

    @Override
    public boolean isBookValid(Book book) {
        if(book.getAuthor().isBlank() || book.getTitle().isBlank()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isBookDuplicate(Book book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equals(book.getAuthor()) && books[i].getTitle().equals(book.getTitle())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isBookDeleted(Book book) {
        if(!isBookDuplicate(book)){
            return false;
        }
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(book)) {
                books[i]=null;
            }
        }
        Book[] newBooks = Arrays.copyOf(books, books.length - 1);
        books = newBooks;
        return true;
    }

    @Override
    public String[] booksList() {
        String[] booksList = new String[books.length];
        for(int i = 0; i < booksList.length; i++) {
            booksList[i] = books[i].getTitle() + " [" + books[i].getAuthor() + "]";
        }
        return booksList;
    }

    @Override
    public Book[] searchByAuthor(String author) {
        Book[] tempResult = new Book[books.length];
        int size = 0;
        for(int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equals(author) || isSearchByLetter(author, books[i].getAuthor())) {
                tempResult[size++] = books[i];
            }
        }
        Book[] result = Arrays.copyOf(tempResult, size);
        return result;
    }

    @Override
    public Book[] searchByTitle(String title) {
        Book[] tempResult = new Book[books.length];
        int size = 0;
        for(int i = 0; i < books.length; i++) {
            if(books[i].getTitle().equals(title) || isSearchByLetter(title, books[i].getTitle())) {
                tempResult[size++] = books[i];
            }
        }
        Book[] result = Arrays.copyOf(tempResult, size);
        return result;
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if(!isBookValid(book)) {
            return false;
        }
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(book)) {
                books[i].setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markBookAsUnread(Book book) {
        if(!isBookValid(book)) {
            return false;
        }
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(book)) {
                books[i].setRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] readBooksList() {
        String[] tempResult = new String[books.length];
        int size = 0;
        for(int i = 0; i < tempResult.length; i++) {
            if(books[i].isRead()) {
                tempResult[size++] = books[i].getTitle() + " [" + books[i].getAuthor() + "]";

            }
        }
        String[] booksList = Arrays.copyOf(tempResult, size);
        return booksList;
    }

    @Override
    public String[] unreadBooksList() {
        String[] tempResult = new String[books.length];
        int size = 0;
        for(int i = 0; i < tempResult.length; i++) {
            if(!books[i].isRead()) {
                tempResult[size++] = books[i].getTitle() + " [" + books[i].getAuthor() + "]";

            }
        }
        String[] booksList = Arrays.copyOf(tempResult, size);
        return booksList;
    }

    boolean isSearchByLetter(String stringToSearch, String stringForSearch) {
        char[] charToSearch = stringToSearch.toCharArray();
        char[] charForSearch = stringForSearch.toCharArray();
        for(int i = 0; i < charToSearch.length; i++) {
            if(charToSearch[i] != charForSearch[i]) {
                return false;
            }
        }
        return true;
    }
}
