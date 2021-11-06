package student_oleg_kozlov.lesson_11.level_3;

import java.util.Objects;

// Task_18, Task_40
public class Book implements Comparable<Book> {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String title, String author, String yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return this.yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(yearOfIssue, book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfIssue);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        int result = this.title.compareTo(other.title);
        if (result == 0) {
            result = this.author.compareTo(other.author);
        }
        if (result == 0) {
            result = this.yearOfIssue.compareTo(other.yearOfIssue);
        }
        return result;
    }
}
