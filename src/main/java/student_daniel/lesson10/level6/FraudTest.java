package student_daniel.lesson10.level6;

import java.util.Objects;

public class FraudTest {
    //Task 30 31 32 33
    public static void main(String[] args) {
        FraudTest myTest = new FraudTest();
        myTest.pokemonTest();
        myTest.amountTest();
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

    //Fraud Rule Name List
    private FraudRule[] fraudRules = {
        new FraudRule1("Fraud by Full name"),
        new FraudRule2("Fraud by Amount"),
        new FraudRule3("Fraud by City"),
        new FraudRule4("Fraud by Country"),
        new FraudRule5("Fraud by Country and Amount"),
    };

    FraudDetector myFraudDetector = new FraudDetector(fraudRules);

    //Tests
    void pokemonTest() {
        Transaction thisTransaction = new Transaction(new Trader("Pokemon", "Unknown", "Unknown"), 0);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Fraud by Full name", "Pokemon","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Full name): " + resetColor + actualResult.toString());
    }

    void amountTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Unknown", "Unknown"), 1000001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Fraud by Amount", "Unknown","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Amount): " + resetColor + actualResult.toString());
    }

    void cityTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Сидней", "Unknown"), 0);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Fraud by City", "Unknown","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (City): " + resetColor + actualResult.toString());
    }

    void countryTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Unknown", "Ямайка"), 0);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Fraud by Country", "Unknown","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Country): " + resetColor + actualResult.toString());
    }

    void countryAndAmountTest() {
        Transaction thisTransaction = new Transaction(new Trader("Unknown", "Unknown", "Германия"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Fraud by Country and Amount", "Unknown","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Country and Amount): " + resetColor + actualResult.toString());
    }

    void emptyTest() {
        Transaction thisTransaction = new Transaction(new Trader("", "", ""), 0);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Out of Fraud Rules", "Unknown","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (Empty): " + resetColor + actualResult.toString());
    }

    void notFraudTest() {
        Transaction thisTransaction = new Transaction(new Trader("Not Pokemon", "Riga", "Германия"), 1000);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Out of Fraud Rules", "Unknown","Unknown","Unknown");
        FraudDetectionResult actualResult = myFraudDetector.isFraud(thisTransaction);
        check(expectedResult, actualResult, "Transaction is fraud (All Good Values): " + resetColor + actualResult.toString());
    }

    void check(FraudDetectionResult expectedResult, FraudDetectionResult actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
