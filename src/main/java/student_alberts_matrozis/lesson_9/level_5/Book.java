package student_alberts_matrozis.lesson_9.level_5;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private boolean readed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    @Override
    public String toString() {
        return title + " [" + author + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return readed == book.readed && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
}
