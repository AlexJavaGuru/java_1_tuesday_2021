package student_daniel.lesson10.level4;

import java.util.Objects;

class FraudTest {
    //Task 17 18 18 20 21
    public static void main(String[] args) {
        FraudTest myTest = new FraudTest();
        myTest.pokemonTest();
        myTest.millionTest();
        myTest.cityTest();
        myTest.countryTest();
        myTest.countryAndAmountTest();
        myTest.emptyTest();
        myTest.notFraudTest();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    FraudDetector myFraudDetector = new FraudDetector();

    //Tests
    void pokemonTest() {
        Transaction thisTransaction = new Transaction(new Trader("Pokemon", "Unknown", "Unknown"), 0);
        boolean expectedResult = true;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Fullname): " + actualResult);
    }

    void millionTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Unknown", "Unknown"), 1000001);
        boolean expectedResult = true;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Amount): " + actualResult);
    }

    void cityTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Сидней", "Unknown"), 0);
        boolean expectedResult = true;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (City): " + actualResult);
    }

    void countryTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Unknown", "Ямайка"), 0);
        boolean expectedResult = true;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Country): " + actualResult);
    }

    void countryAndAmountTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Unknown", "Германия"), 1001);
        boolean expectedResult = true;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Country and Amount): " + actualResult);
    }

    void emptyTest() {
        Transaction thisTransaction = new Transaction(new Trader("", "", ""), 0);
        boolean expectedResult = false;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Empty): " + actualResult);
    }

    void notFraudTest() {
        Transaction thisTransaction = new Transaction(new Trader("Not Pokemon", "Riga", "Германия"), 1000);
        boolean expectedResult = false;
        boolean actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (All Good Values): " + actualResult);
    }

    void check(boolean expectedResult, boolean actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
