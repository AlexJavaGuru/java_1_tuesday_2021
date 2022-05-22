package student_daniel.lesson8.level3;

class Rectangle extends Figure {
    //Task 13
    private final double width;
    private final double height;

    Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}