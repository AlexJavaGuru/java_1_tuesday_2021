package student_einars_marhilevics.lesson_8.level_4;

public abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
