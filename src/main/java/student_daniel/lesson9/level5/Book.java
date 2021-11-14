package student_daniel.lesson9.level5;

import java.util.Objects;

public class Book {
    //Task 13 14 15 16 17 18 19 20 21 22 23 24
    String authorName;
    String titleName;
    boolean isRead = false;
    boolean isUnread = false;

    public Book(String authorName, String titleName) {
        this.authorName = authorName;
        this.titleName = titleName;
    }

    public boolean isRead() {
        return isRead;
    }

    public boolean isUnread() {
        return isUnread;
    }

    public void setUnread(boolean unread) {
        isUnread = unread;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitleName() {
        return titleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorName, book.authorName) && Objects.equals(titleName, book.titleName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", titleName='" + titleName + '\'' +
                '}';
    }
}
