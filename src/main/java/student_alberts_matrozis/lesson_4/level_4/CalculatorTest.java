package student_alberts_matrozis.lesson_4.level_4;

// Task 12, 13, 14, 15

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.testCalculatorSum();
        testRunner.testCalculatorDif();
        testRunner.testCalculatorMult();
        testRunner.testCalculatorDiv();
        testRunner.testCalculatorIsEven();
        testRunner.testCalculatorMaxOfTwoNumbers();
        testRunner.testCalculatorMaxOfThreeNumbers();
    }
    public void testCalculatorSum() {
        int variableOne = 10;
        int variableTwo = 5;
        int expectedResult = 15;
        Calculator subject = new Calculator();
        int actualResult = subject.sum(variableOne, variableTwo);
        check(expectedResult, actualResult, "Test 1 Sum");
    }

    public void testCalculatorDif() {
        int variableOne = 10;
        int variableTwo = 5;
        int expectedResult = 5;
        Calculator subject = new Calculator();
        int actualResult = subject.dif(variableOne, variableTwo);
        check(expectedResult, actualResult, "Test 2 Dif");
    }
    public void testCalculatorMult() {
        int variableOne = 10;
        int variableTwo = 8;
        int exceptedResult = 80;
        Calculator subject = new Calculator();
        int actualResult = subject.mult(variableOne, variableTwo);
        check(exceptedResult, actualResult, "Test 3 Mult");
    }
    public void testCalculatorDiv() {
        int variableOne = 50;
        int variableTwo = 5;
        int exceptedResult = 10;
        Calculator subject = new Calculator();
        int actualResult = subject.div(variableOne, variableTwo);
        check(exceptedResult, actualResult, "Test 4 Div");
    }
    public void testCalculatorIsEven() {
        int variableOne = 13;
        boolean exceptedResult = false;
        Calculator subject = new Calculator();
        boolean actualResult = subject.isEven(variableOne);
        check(exceptedResult, actualResult, "Test 5 IsEven");
    }
    public void testCalculatorMaxOfTwoNumbers() {
        // test 1
        int numberOneTest1 = 12;
        int numberTwoTest1 = 12;
        Calculator subject = new Calculator();
        int exceptedResultOne = 12;
        int actualResultOne = subject.maxOfTwoNumbers(numberOneTest1, numberTwoTest1);
        check(exceptedResultOne, actualResultOne, "Test 6 MaxNumber #1");
        // test 2
        int numberOneTest2 = 9;
        int numberTwoTest2 = 17;
        int exceptedResultTwo = 17;
        int actualResultTwo = subject.maxOfTwoNumbers(numberOneTest2, numberTwoTest2);
        check(exceptedResultTwo, actualResultTwo, "Test 7 MaxNumber #2");
        // test 3
        int numberOneTest3 = 9;
        int numberTwoTest3 = 17;
        int exceptedResultThree = 17;
        int actualResultThree = subject.maxOfTwoNumbers(numberOneTest3, numberTwoTest3);
        check(exceptedResultThree, actualResultThree, "Test 8 MaxNumber #3");
    }
    public void testCalculatorMaxOfThreeNumbers() {
        // Test 1
        int numOneTest1 = 10;
        int numTwoTest1 = 8;
        int numThreeTest1 = 5;
        Calculator subject = new Calculator();
        int exceptedResultOne = 10;
        int actualResultOne = subject.maxOfThreeNumbers(numOneTest1, numTwoTest1, numThreeTest1);
        check(exceptedResultOne, actualResultOne, "Test 9 MaxNumberOfThree #1");
        // Test 2
        int numOneTest2 = 8;
        int numTwoTest2 = 10;
        int numThreeTest2 = 5;
        int exceptedResultTwo = 10;
        int actualResultTwo = subject.maxOfThreeNumbers(numOneTest2, numTwoTest2, numThreeTest2);
        check(exceptedResultOne, actualResultOne, "Test 10 MaxNumberOfThree #2");
        // Test 3
        int numOneTest3 = 8;
        int numTwoTest3 = 5;
        int numThreeTest3 = 10;
        int exceptedResultThree = 10;
        int actualResultThree = subject.maxOfThreeNumbers(numOneTest3, numTwoTest3, numThreeTest3);
        check(exceptedResultOne, actualResultOne, "Test 11 MaxNumberOfThree #3");
        // Test 4
        int numOneTest4 = 8;
        int numTwoTest4 = 8;
        int numThreeTest4 = 5;
        int exceptedResultFour = 10;
        int actualResultFour = subject.maxOfThreeNumbers(numOneTest4, numTwoTest4, numThreeTest4);
        check(exceptedResultOne, actualResultOne, "Test 12 MaxNumberOfThree #4");
        // Test 5
        int numOneTest5 = 10;
        int numTwoTest5 = 8;
        int numThreeTest5 = 8;
        int exceptedResultFive = 10;
        int actualResultFive = subject.maxOfThreeNumbers(numOneTest5, numTwoTest5, numThreeTest5);
        check(exceptedResultFive, actualResultFive, "Test 13 MaxNumberOfThree #5");
        // Test 6
        int numOneTest6 = 8;
        int numTwoTest6 = 10;
        int numThreeTest6 = 5;
        int exceptedResultSix = 10;
        int actualResultSix = subject.maxOfThreeNumbers(numOneTest6, numTwoTest6, numThreeTest6);
        check(exceptedResultSix, actualResultSix, "Test 14 MaxNumberOfThree #6");
    }


    // Check
    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
