package student_sergej_pereligin.lesson_8.level_5;

public class Circle extends Shape {

    private int radius;

    Circle(int radius) {
        super();
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
