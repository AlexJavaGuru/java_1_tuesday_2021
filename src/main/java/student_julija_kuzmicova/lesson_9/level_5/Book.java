package student_julija_kuzmicova.lesson_9.level_5;

//Task_13, Task_21
class Book {

    private String title;
    private String author;
    private boolean isRead;

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

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
