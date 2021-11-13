package student_josifs_makarenko.lesson_9.level5;

public class Book {
    private String author;
    private String name;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }


    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + " [" + author + "]";
    }
}
