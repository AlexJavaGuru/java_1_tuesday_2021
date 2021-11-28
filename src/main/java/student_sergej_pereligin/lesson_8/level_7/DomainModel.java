package student_sergej_pereligin.lesson_8.level_7;


public abstract class DomainModel {


    public abstract void borrowBook();
    public abstract void returnBook();
    public abstract String findBook(String bookName, String bookAuthor, int publishDate);
    public abstract void reserveBook();
    public abstract void notifyUser();
    public abstract void fineUser();
    public abstract void addNewBookToLibrary();


}
