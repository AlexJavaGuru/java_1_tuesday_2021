package student_einars_marhilevics.lesson_9.level_5;

class BookReaderImpl implements BookReader {

    Book[] books = new Book[0];

    @Override
    public boolean addBook(Book book) {
        if (!fullInfoBook(book)) {
            return false;
        }
        if (isDuplicateBook(book)) {
            return false;
        }
        Book[] copy = new Book[books.length + 1];
        System.arraycopy(books, 0, copy, 0, books.length);
        books = copy;
        books[books.length - 1] = book;
        return true;
    }

    @Override
    public boolean isDuplicateBook(Book book) {
        if (book == null) {
            return false;
        }
        for (Book books : books) {
            if (books.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean fullInfoBook(Book book) {
        if (book == null) {
            return false;
        }
        return !book.getAuthor().isEmpty() && !book.getTitle().isEmpty();
    }

    @Override
    public boolean removeBook(Book book) {
        if (book == null) {
            return false;
        }
        if (!isDuplicateBook(book)) {
            return false;
        }
        if (!fullInfoBook(book)) {
            return false;
        }
        Book[] copy = new Book[books.length - 1];
        int j = 0;
        boolean completed = false;
        for (Book value : books) {
            if (value.equals(book)) {
                completed = true;
                continue;
            }
            copy[j] = value;
            j++;
        }
        if (completed) {
            books = copy;
        }
        return completed;
    }



    @Override
    public String[] getAllBooks() {
        String[] allBooks = new String[books.length];
        int i = 0;
        for (Book book : books) {
            allBooks[i] = book.getTitle() + " [" + book.getAuthor() + "]";
            i++;
        }
        return allBooks;
    }

    @Override
    public Book[] getBooksByAuthor(String author) {
        Book[] result = new Book[books.length];
        int i = 0;
        boolean matched;
        for (Book book : books) {
            matched = book.getAuthor().equals(author);
            if (matched) {
                result[i] = book;
                i++;
            }
        }
        return result;
    }

    @Override
    public Book[] getBooksByTitle(String title) {
        Book[] result = new Book[books.length];
        int i = 0;
        boolean matched;
        for (Book book : books) {
            matched = book.getTitle().equals(title);
            if (matched) {
                result[i] = book;
                i++;
            }
        }
        return result;
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if (book == null) {
            return false;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i].setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markBookAsUnread(Book book) {
        if (book == null) {
            return false;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i].setRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getReadBooksList() {
        String[] readBooks = new String[books.length];
        int i = 0;
        for (Book book : books) {
            if (book.isRead()) {
                readBooks[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                i++;
            }
        }
        return readBooks;
    }

    @Override
    public String[] getUnreadBooksList() {
        String[] unreadBooks = new String[books.length];
        int i = 0;
        for (Book book : books) {
            if (!book.isRead()) {
                unreadBooks[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                i++;
            }
        }
        return unreadBooks;
    }
}
