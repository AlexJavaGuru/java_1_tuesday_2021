package student_alberts_matrozis.lesson_8.level_5;

class Circle extends Shape{
    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (((radius * radius) * 3.14) * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
