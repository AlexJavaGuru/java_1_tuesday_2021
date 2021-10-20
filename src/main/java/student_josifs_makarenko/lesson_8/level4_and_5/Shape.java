package student_josifs_makarenko.lesson_8.level4_and_5;

abstract class Shape {

    private String title;

    public String getTitle() {
        return title;
    }


    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
