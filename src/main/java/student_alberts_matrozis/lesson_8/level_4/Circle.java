package student_alberts_matrozis.lesson_8.level_4;

class Circle extends Shape{
    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (radius * radius) * 3.14;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
