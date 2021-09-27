package student_josifs_makarenko.lesson_8.level4_and_5;

public class Rectangle extends Shape{

    private double firstSide;
    private double secondSide;

    Rectangle(double firstSide, double secondSide) {
        super("Rectangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    double calculatePerimeter() {
        return (firstSide + secondSide) * 2;
    }
}
