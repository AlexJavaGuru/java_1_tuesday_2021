package student_josifs_makarenko.lesson_8.level7.task_32;

public class MathOperationTest {
    public static void main(String[] args) {
        additionTest();
        subtractionTest();
        multiplyTest();
        divideTest();
    }

    static void additionTest () {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(5);
        MathOperation addition = new Addition(arg1, arg2);
        check(addition.calculate() == 10, "Addition Test");
    }

    static void divideTest () {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(5);
        MathOperation divide = new Divide(arg1, arg2);
        check(divide.calculate() == 1, "Divide Test");
    }

    static void multiplyTest () {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(5);
        MathOperation multiply = new Multiply(arg1, arg2);
        check(multiply.calculate() == 25, "Multiply Test");
    }

    static void subtractionTest () {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(5);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        check(subtraction.calculate() == 0, "Subtraction Test");
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
