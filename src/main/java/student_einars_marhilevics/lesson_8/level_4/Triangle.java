package student_einars_marhilevics.lesson_8.level_4;

public class Triangle extends Shape{
    double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }


    @Override
    double calculateArea() {
        return (1.73 * side * side) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
