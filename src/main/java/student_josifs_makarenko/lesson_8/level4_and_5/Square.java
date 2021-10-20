package student_josifs_makarenko.lesson_8.level4_and_5;

public class Square extends Shape {


    private double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
