package student_einars_marhilevics.lesson_8.level_4;

public class Square extends Shape{
    int side;

    public Square(String title, double side) {
        super(title);
        this.side = (int) side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
