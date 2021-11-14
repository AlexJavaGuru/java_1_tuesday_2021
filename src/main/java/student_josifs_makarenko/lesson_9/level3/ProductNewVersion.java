package student_josifs_makarenko.lesson_9.level3;

//task 8
public class ProductNewVersion {

    private String title;

    public ProductNewVersion(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "ProductNewVersion{" +
                "title=" + title +
                '}';
    }
}
