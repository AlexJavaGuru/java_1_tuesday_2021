package student_sergej_pereligin.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
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
        int firstNumber1 = 15;  // подготавливаем тестовые данные
        int secondNumber1 = 5;  // подготавливаем тестовые данные
        int expectedResult1 = 3;
        int realResult1 = calculator.devide(firstNumber1, secondNumber1);  // вызываем продакшен код, который хотим протестировать
        if (realResult1 == expectedResult1) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Devide test = OK");
        } else {
            System.out.println("Devide test = FAIL");
        }
        int firstNumber2 = 10;  // подготавливаем тестовые данные
        int secondNumber2 = 5;  // подготавливаем тестовые данные
        int expectedResult2 = 5;
        int realResult2 = calculator.substraction(firstNumber2, secondNumber2);  // вызываем продакшен код, который хотим протестировать
        if (realResult2 == expectedResult2) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("substraction test = OK");
        } else {
            System.out.println("substraction test = FAIL");
        }

    }
}
