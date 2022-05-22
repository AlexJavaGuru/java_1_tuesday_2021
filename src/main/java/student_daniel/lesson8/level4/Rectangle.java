package student_daniel.lesson8.level4;

public class Rectangle extends Shape {
    //Task 18
    private final double sideOne;
    private final double sideTwo;

    Rectangle(double sideOne, double sideTwo, String title) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return (2 * sideOne) + (2 * sideTwo);
    }
}