package student_daniel.lesson4.level4;

class CalculatorDemo {
    //Task 11 12
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();

        myCalculator.increase();
        myCalculator.decrease();
        myCalculator.multiply();
        myCalculator.divide();
        myCalculator.printResult();

        calculatorTest.sumTest();
    }
}
