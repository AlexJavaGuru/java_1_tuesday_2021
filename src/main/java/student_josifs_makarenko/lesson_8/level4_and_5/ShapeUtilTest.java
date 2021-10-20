package student_josifs_makarenko.lesson_8.level4_and_5;

public class ShapeUtilTest {
    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape firstShape = shapeUtil.createRandomShape();
        Shape secondShape = shapeUtil.createRandomShape();
        Shape thirdShape = shapeUtil.createRandomShape();
        shapeUtil.addToArray(firstShape);
        shapeUtil.addToArray(thirdShape);
        shapeUtil.addToArray(secondShape);

        check(shapeUtil.calculateArea(ShapeUtil.shapes) != 0, "calculateAreaTest");
    }

    static void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape firstShape = shapeUtil.createRandomShape();
        Shape secondShape = shapeUtil.createRandomShape();
        Shape thirdShape = shapeUtil.createRandomShape();
        shapeUtil.addToArray(firstShape);
        shapeUtil.addToArray(thirdShape);
        shapeUtil.addToArray(secondShape);

        check(shapeUtil.calculatePerimeter(ShapeUtil.shapes) != 0, "calculatePerimeterTest");
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
