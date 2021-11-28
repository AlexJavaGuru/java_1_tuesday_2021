package student_sergej_pereligin.lesson_8.level_5;


public class Square extends Shape {

    public int side;

    Square(int side) {
        super();
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

