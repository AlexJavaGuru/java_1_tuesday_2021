package student_daniel.lesson4.level4;

class CalculatorTest {
    //Task 12
    public double plus(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double minus(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public double divide(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    public void sumTest() {
        CalculatorTest myCalculatorTest = new CalculatorTest();

        double firstNum = 10;  // подготавливаем тестовые данные
        double secondNum = 5;
        double thirdNum = 1;

        double plusResult = 15;
        double minusResult = 5;
        double multiplyResult = 50;
        double divideResult = 2;

        double realResult = myCalculatorTest.plus(firstNum, secondNum);  // вызываем продакшен код, который хотим протестировать
        if (realResult == plusResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK, results is:");
            System.out.println(firstNum + secondNum);
        } else {
            System.out.println("Test = FAILED");
        }

        double realResultTwo = myCalculatorTest.minus(firstNum, secondNum);
        if (realResultTwo == minusResult) {
            System.out.println("Test = OK, results is:");
            System.out.println(firstNum - secondNum);
        } else {
            System.out.println("Test = FAILED");
        }

        double realResultThree = myCalculatorTest.multiply(firstNum, secondNum);
        if (realResultThree == multiplyResult) {
            System.out.println("Test = OK, results is:");
            System.out.println(firstNum * secondNum);
        } else {
            System.out.println("Test = FAILED");
        }

        double realResultFour = myCalculatorTest.divide(firstNum, secondNum);
        if (realResultFour == divideResult) {
            System.out.println("Test = OK, results is:");
            System.out.println(firstNum / secondNum);
        } else {
            System.out.println("Test = FAILED");
        }
    }

}