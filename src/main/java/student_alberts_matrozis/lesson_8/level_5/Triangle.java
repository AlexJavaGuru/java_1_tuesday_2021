package student_alberts_matrozis.lesson_8.level_5;

class Triangle extends Shape {
    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.round(((Math.sqrt(3) / 4) * (side * side)) * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
