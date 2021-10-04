package student_einars_marhilevics.lesson_8.level_4;

public class Rectangle extends Shape{
    double sideOne;
    double sideTwo;

    public Rectangle(String title, double sideOne, double sideTwo) {
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
        return 2 * sideOne + 2 * sideTwo;
    }
}
