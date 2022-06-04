package student_daniel.lesson9.level5;

public class BookReaderImpl implements BookReader {
    //Task 13 14 15 16 17 18 19 20 21 22 23 24
    Book[] myBooks = new Book[0];

    @Override
    public boolean addNewBook(Book book) {
        if (book != null && !isDuplicate(book) && !isBlank(book)) {
            Book[] newBook = new Book[myBooks.length + 1];
            for (int i = 0; i < myBooks.length; i++) {
                newBook[i] = myBooks[i];
            }
            myBooks = newBook;
            myBooks[myBooks.length - 1] = book;
            return true;
        }
        return false;
    }

    @Override
    public boolean isDuplicate(Book book) {
        for (Book thisBook : myBooks) {
            if (thisBook.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isBlank(Book book) {
        if (book.getAuthorName().isBlank() || book.getTitleName().isBlank() || book.getTitleName() == null || book.getAuthorName() == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (book != null && !isBlank(book)) {
            Book[] newBookArray = new Book[myBooks.length - 1];
            int length = 0;
            boolean delete = false;
            for (int i = 0; i < myBooks.length; i++) {
                if (myBooks[i].equals(book)) {
                    delete = true;
                    continue;
                }
                newBookArray[length] = myBooks[i];
                length++;
            }
            if (delete) {
                myBooks = newBookArray;
            }
            return delete;
        }
        return false;
    }

    @Override
    public String[] getCurrentBookList() {
        String[] currentList = new String[myBooks.length];
        int length = 0;
        for (Book thisBook : myBooks) {
            currentList[length] = thisBook.getTitleName() + " [" + thisBook.getAuthorName() + "]";
            length++;
        }
        return currentList;
    }

    @Override
    public Book[] getBooksByAuthorName(String authorName) {
        int length = 0;
        boolean foundAuthor;
        for (Book thisBook : myBooks) {
            foundAuthor = thisBook.getAuthorName().equals(authorName);
            if (foundAuthor) {
                length++;
            }
        }
        Book[] currentListByAuthor = new Book[length];
        int calculatedLength = 0;
        for (Book thisBook : myBooks) {
            foundAuthor = thisBook.getAuthorName().equals(authorName);
            if (foundAuthor) {
                currentListByAuthor[calculatedLength] = thisBook;
                calculatedLength++;
            }
        }
        return currentListByAuthor;
    }

    @Override
    public Book[] getBooksByAuthorFirstName(String authorName) {
        int length = 0;
        boolean foundAuthor;
        for (Book thisBook : myBooks) {
            String[] splitStringFromAuthorName = authorName.split(" ");
            String gotNameFromAuthorName = splitStringFromAuthorName[0];
            String[] splitStringFromBook = thisBook.getAuthorName().split(" ");
            String gotNameFromBook = splitStringFromBook[0];
            foundAuthor = gotNameFromAuthorName.equals(gotNameFromBook);
            if (foundAuthor) {
                length++;
            }
        }
        Book[] currentListByAuthor = new Book[length];
        int calculatedLength = 0;
        for (Book thisBook : myBooks) {
            String[] splitStringFromAuthorName = authorName.split(" ");
            String gotNameFromAuthorName = splitStringFromAuthorName[0];
            String[] splitStringFromBook = thisBook.getAuthorName().split(" ");
            String gotNameFromBook = splitStringFromBook[0];
            foundAuthor = gotNameFromAuthorName.equals(gotNameFromBook);
            if (foundAuthor) {
                currentListByAuthor[calculatedLength] = thisBook;
                calculatedLength++;
            }
        }
        return currentListByAuthor;
    }

    @Override
    public Book[] getBooksByTitleName(String titleName) {
        int length = 0;
        boolean foundTitle;
        for (Book thisBook : myBooks) {
            foundTitle = thisBook.getTitleName().equals(titleName);
            if (foundTitle) {
                length++;
            }
        }
        Book[] currentListByTitle = new Book[length];
        int calculatedLength = 0;
        for (Book thisBook : myBooks) {
            foundTitle = thisBook.getTitleName().equals(titleName);
            if (foundTitle) {
                currentListByTitle[calculatedLength] = thisBook;
                calculatedLength++;
            }
        }
        return currentListByTitle;
    }

    @Override
    public Book[] getBooksByTitleFirstName(String titleName) {
        int length = 0;
        boolean foundTitle;
        for (Book thisBook : myBooks) {
            String[] splitStringFromTitleName = titleName.split(" ");
            String gotNameFromTitleName = splitStringFromTitleName[0];
            String[] splitStringFromBook = thisBook.getTitleName().split(" ");
            String gotNameFromBook = splitStringFromBook[0];
            foundTitle = gotNameFromTitleName.equals(gotNameFromBook);
            if (foundTitle) {
                length++;
            }
        }
        Book[] currentListByTitle = new Book[length];
        int calculatedLength = 0;
        for (Book thisBook : myBooks) {
            String[] splitStringFromTitleName = titleName.split(" ");
            String gotNameFromTitleName = splitStringFromTitleName[0];
            String[] splitStringFromBook = thisBook.getTitleName().split(" ");
            String gotNameFromBook = splitStringFromBook[0];
            foundTitle = gotNameFromTitleName.equals(gotNameFromBook);
            if (foundTitle) {
                currentListByTitle[calculatedLength] = thisBook;
                calculatedLength++;
            }
        }
        return currentListByTitle;
    }

    @Override
    public boolean markAsRead(Book book) {
        if (book != null && !isBlank(book)) {
            for (int i = 0; i < myBooks.length; i++) {
                if (myBooks[i].equals(book)) {
                    myBooks[i].setRead(true);
                    myBooks[i].setUnread(false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean markAsUnread(Book book) {
        if (book != null && !isBlank(book)) {
            for (int i = 0; i < myBooks.length; i++) {
                if (myBooks[i].equals(book)) {
                    myBooks[i].setRead(false);
                    myBooks[i].setUnread(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String[] getReadBooksList() {
        int length = 0;
        for (Book thisBook : myBooks) {
            if(thisBook.isRead()) {
                length++;
            }
        }
        String[] currentReadList = new String[length];
        int calculatedLength = 0;
        for (Book thisBook : myBooks) {
            if(thisBook.isRead()) {
                currentReadList[calculatedLength] = thisBook.getTitleName() + " [" + thisBook.getAuthorName() + "]";
                calculatedLength++;
            }
        }
        return currentReadList;
    }

    @Override
    public String[] getUnreadBooksList() {
        int length = 0;
        for (Book thisBook : myBooks) {
            if(thisBook.isUnread()) {
                length++;
            }
        }
        String[] currentUnreadList = new String[length];
        int calculatedLength = 0;
        for (Book thisBook : myBooks) {
            if(thisBook.isUnread()) {
                currentUnreadList[calculatedLength] = thisBook.getTitleName() + " [" + thisBook.getAuthorName() + "]";
                calculatedLength++;
            }
        }
        return currentUnreadList;
    }
}