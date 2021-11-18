package student_julija_kuzmicova.lesson_8.level_4;

//Task_19
class Triangle extends Shape {

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) / 4 * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
