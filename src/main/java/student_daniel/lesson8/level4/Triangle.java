package student_daniel.lesson8.level4;

public class Triangle extends Shape {
    //Task 19
    private final double base;
    private final double height;

    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(double base, double height, double sideA, double sideB, double sideC, String title) {
        super(title);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
