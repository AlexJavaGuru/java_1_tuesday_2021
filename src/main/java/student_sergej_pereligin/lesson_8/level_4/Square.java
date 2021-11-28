package student_sergej_pereligin.lesson_8.level_4;


public class Square extends Shape {

    public int side;

    Square(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
