package student_josifs_makarenko.lesson_8.level4_and_5;

public class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    double calculatePerimeter() {
        return (Math.PI * radius * 2);
    }
}
