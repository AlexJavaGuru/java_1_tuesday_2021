package student_oleg_kozlov.lesson_8.level_4;

// Task_17
class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
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
