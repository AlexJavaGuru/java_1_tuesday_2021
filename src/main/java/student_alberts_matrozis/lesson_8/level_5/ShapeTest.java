package student_alberts_matrozis.lesson_8.level_5;

import static student_alberts_matrozis.albertsUtils.Utils.check;

class ShapeTest {

    public static void main(String[] args) {
        ShapeTest testRunner = new ShapeTest();
        testRunner.circleTest();
        testRunner.rectangleTest();
        testRunner.squareTest();
        testRunner.triangleTest();
    }

    public void circleTest() {
        Circle subject = new Circle("Circle", 10);
        double receivedAreaResult = subject.calculateArea();
        double exceptedAreaResult = 314.0;
        check(receivedAreaResult, exceptedAreaResult);

        double receivedPerimeterResult = Math.round(subject.calculatePerimeter() * 100.0) / 100.0;
        double exceptedPerimeterResult = 62.8;
        check(receivedPerimeterResult, exceptedPerimeterResult);
    }

    public void rectangleTest() {
        Rectangle subject = new Rectangle("Rectangle", 10, 15);
        double receivedAreaResult = subject.calculateArea();
        double exceptedAreaResult = 150.0;
        check(receivedAreaResult, exceptedAreaResult);

        double receivedPerimeterResult = Math.round(subject.calculatePerimeter() * 100.0) / 100.0;
        double exceptedPerimeterResult = 50.0;
        check(receivedPerimeterResult, exceptedPerimeterResult);
    }

    public void squareTest() {
        Square subject = new Square("Square", 7);
        double receivedAreaResult = subject.calculateArea();
        double exceptedAreaResult = 49.0;
        check(receivedAreaResult, exceptedAreaResult);

        double receivedPerimeterResult = Math.round(subject.calculatePerimeter() * 100.0) / 100.0;
        double exceptedPerimeterResult = 28.0;
        check(receivedPerimeterResult, exceptedPerimeterResult);
    }

    public void triangleTest() {
        Triangle subject = new Triangle("Triangle", 8);
        double receivedAreaResult = Math.round(subject.calculateArea() * 100.0) / 100.0;
        double exceptedAreaResult = 27.71;
        check(receivedAreaResult, exceptedAreaResult);

        double receivedPerimeterResult = Math.round(subject.calculatePerimeter() * 100.0) / 100.0;
        double exceptedPerimeterResult = 24.0;
        check(receivedPerimeterResult, exceptedPerimeterResult);
    }

}
