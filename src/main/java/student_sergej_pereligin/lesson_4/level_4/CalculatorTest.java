package student_sergej_pereligin.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.subtractTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwo();
        calculatorTest.maxofThree();
    }

    private void maxOfTwo() { Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwo(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("MaxValue of two numbers test passed.");
        } else {
            System.out.println("MaxValue of two numbers test failed");

        }
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int expectedResult = 8;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    void evenTest() {
        Calculator calculator = new Calculator();
        int number = 10;
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(number);
        if (actualResult == expectedResult) {
            System.out.println("Even test passed.");
        } else {
            System.out.println("Even test failed");
        }

    }

    void maxofThree() {
        Calculator calculator = new Calculator();
        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 15;
        int expectedResult = 20;
        int actualResult = calculator.maxofThree(firstNumber, secondNumber, thirdNumber);
        if (actualResult == expectedResult) {
            System.out.println("MaxValue of three numbers passed.");
        } else {
            System.out.println("MaxValue of three numbers failed.");
        }

    }
}
