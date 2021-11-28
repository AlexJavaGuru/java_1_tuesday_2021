package student_sergej_pereligin.lesson_8.level_4;


public class Circle extends Shape{

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
