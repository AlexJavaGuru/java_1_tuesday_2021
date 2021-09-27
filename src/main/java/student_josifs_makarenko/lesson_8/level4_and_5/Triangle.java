package student_josifs_makarenko.lesson_8.level4_and_5;

public class Triangle extends Shape {

    double side;

    Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) * Math.pow(side, 2)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
