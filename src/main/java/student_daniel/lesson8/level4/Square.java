package student_daniel.lesson8.level4;

public class Square extends Shape {
    //Task 17
    private double squareSide;

    Square(double squareSide, String title) {
        super(title);
        this.squareSide = squareSide;
    }

    @Override
    double calculateArea() {
        return squareSide * squareSide;
    }

    @Override
    double calculatePerimeter() {
        return 4 * squareSide;
    }
}
