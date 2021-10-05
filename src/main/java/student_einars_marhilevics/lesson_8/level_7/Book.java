package student_einars_marhilevics.lesson_8.level_7;

import java.util.Objects;

public class Book {

    private Long id;
    private String title;
    private String author;
    private boolean isTaken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public boolean isTaken() {
        return isTaken;
    }

    public boolean isNotTaken() {
        return !isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
