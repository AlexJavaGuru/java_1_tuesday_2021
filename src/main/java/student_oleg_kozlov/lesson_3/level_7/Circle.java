package student_oleg_kozlov.lesson_3.level_7;

// Task_30
class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        // Circle area = pi * radius * radius
        return Math.PI * (radius * radius);
    }
}
