package student_daniel.lesson8.level4;

public class Circle extends Shape {
    //Task 16
    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }
}
