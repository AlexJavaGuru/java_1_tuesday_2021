package student_josifs_makarenko.lesson_8.level4_and_5;

public class ShapeTest {
    public static void main(String[] args) {
        circleTest();
        rectangleTest();
        squareTest();
        triangleTest();
    }

    static void circleTest() {
        Circle circle = new Circle(5);
        check(circle.calculateArea() == (25 * Math.PI) && circle.calculatePerimeter() == (10 * Math.PI), "CircleTest");
    }

    static void rectangleTest() {
        Rectangle rectangle = new Rectangle(5, 6);
        check(rectangle.calculateArea() == 30 && rectangle.calculatePerimeter() == 22, "RectangleTest");
    }

    static void squareTest() {
        Square square = new Square(5);
        check(square.calculateArea() == 25 && square.calculatePerimeter() == 20, "SquareTest");
    }

    static void triangleTest() {
        Triangle triangle = new Triangle(5);
        check(triangle.calculateArea() == 10.825317547305483 && triangle.calculatePerimeter() == 15, "TriangleTEst");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK!" +
                    "\n" +
                    "░░░░░░░░░░░░░██\n" +
                    "░░░░░░░░░░░░█░░█\n" +
                    "░░░░░░░░░░░░█░░█\n" +
                    "░░░░░░░░░░░█░░░█\n" +
                    "░░░░░░░░░░█░░░░█\n" +
                    "████████▄▄█░░░░░███████████▄\n" +
                    "▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░░█\n" +
                    "▓▓▓▓▓▓▓█░░█░░░█▀█░█▀▀░█▀█░░░█\n" +
                    "▓▓▓▓▓▓▓█▀▀█▀▀░█▀▄░█▀░░█▀▀░░░█\n" +
                    "▓▓▓▓▓▓▓█░░█░░░▀░▀░▀▀▀░▀░░░░█\n" +
                    "▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░█\n" +
                    "▓▓▓▓▓▓▓█████░░░░░░░░░░░░░█\n" +
                    "███████▀░░░░▀▀██████████▀");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER!");
            System.out.println("""
                    ░░░░░▄▄▄▀▀▀▀▀▀▀▀▀▄▄▄░░░░░░░░░
                    ░░░▄▀░░░░░░░░░░░░░░░▀▀▄▄░░░░░
                    ░░▄▀░░░░░░░░░░░░░░░░░░░░▀▄░░░
                    ░▄▀░░░░░░░░░░░░░░░░░░░░░░░█░░
                    ░█░░░░░░░░░░░░░░░░░░░░░░░░░█░
                    ▐░░░░░░░░░░░░░░░░░░░░░░░░░░░█
                    █░░░░▀▀█▄▄▄░░░▄▌░░░░░░░░░░░░▐
                    ▌░░░░░▌░██▀█▀▀░░░▄▄▄▄▄░░░░▌░▐
                    ▌░░░░░▀▄▄▄▀░░░░░░▌░▀███▄▄▀░░▐
                    ▌░░░░░░░░░░░░░░░░░▀▄▄▄▄▀░░░▄▌
                    ▐░░░░▐▀░░░░░░░░░░░░░░░░░░░▄▀░
                    ░█░░░▌░░▄▀▀▀▄▄▄░░░░░░░░░░▄▀░░
                    ░░█░░▀░░░░▄▄▄▄░▀▀▌░░▌░░░█░░░░
                    ░░░▀▄░░░░░░░░░▀░░░▄▀░░▄▀░░░░░
                    ░░░░░▀▄▄▄░░░░░░░░░▄▄▀▀░░░░░░░
                    ░░░░░░░░▐▀▀▀▀▀▀▀▀▀░░░░░░░░░░░
                    ░░░░░░░░█░░░░░░░░░░░░░░░░░░░░
                    █▀▀█ █▀▀█ █▀▀ 　 █░░█ █▀▀█ █░░█
                    █▄▄█ █▄▄▀ █▀▀ 　 █▄▄█ █░░█ █░░█
                    ▀░░▀ ▀░▀▀ ▀▀▀ 　 ▄▄▄█ ▀▀▀▀ ░▀▀▀
                    ▒█░▄▀ ▀█▀ ▒█▀▀▄ ▒█▀▀▄ ▀█▀ ▒█▄░▒█ ▒█▀▀█
                    ▒█▀▄░ ▒█░ ▒█░▒█ ▒█░▒█ ▒█░ ▒█▒█▒█ ▒█░▄▄
                    ▒█░▒█ ▄█▄ ▒█▄▄▀ ▒█▄▄▀ ▄█▄ ▒█░░▀█ ▒█▄▄█
                    ▒█▀▄▀█ ▒█▀▀▀ ▀█
                    ▒█▒█▒█ ▒█▀▀▀ █▀
                    ▒█░░▒█ ▒█▄▄▄ ▄░""");
        }
    }
}
