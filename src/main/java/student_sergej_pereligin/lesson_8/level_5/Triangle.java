package student_sergej_pereligin.lesson_8.level_5;

public class Triangle extends Shape {

    private double side;

    Triangle(double side) {
        super();
        this.side = side;
    }

    @Override
    double calculateArea() {
        double area = (Math.sqrt(3) / 4) * (side * side);
        return Math.round(area);
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}