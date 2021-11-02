package student_oleg_kozlov.lesson_10.level_1_intern;

// Task_6
class Book {
    private String title;
    private String author;

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

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
