package student_daniel.lesson7.level6;

import java.util.Objects;

public class CreditCardTest {
    //Task 10
    public static void main(String[] args) {
        CreditCardTest myTest = new CreditCardTest();
        myTest.invalidPinDepositTest();
        myTest.depositTest();
        myTest.depositWithDebtCoverTest();
        myTest.depositWithPartDebtCoverTest();
        myTest.invalidPinWithdrawTest();
        myTest.withdrawTestToZero();
        myTest.withdrawTestToPositive();
        myTest.withdrawTestToNegative();
        myTest.withdrawWithoutExceedingTheLimitTest();
        myTest.withdrawExceedingTheLimitTest();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Tests
    void invalidPinDepositTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        double depositValue = 10.0;
        double expectedResult = 0.0;
        double actualResult = myCredit.depositAmount(0, depositValue);
        check(expectedResult, actualResult, "Deposit >>> Invalid PIN >>> Credit card balance is: " + actualResult);
    }

    void invalidPinWithdrawTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        double withdrawValue = 10.0;
        double expectedResult = 0.0;
        double actualResult = myCredit.withdrawAmount(0, withdrawValue);
        check(expectedResult, actualResult, "Withdraw >>> Invalid PIN >>> Credit card balance is: " + actualResult);
    }

    void depositTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        double depositValue = 10.0;
        double expectedResult = 10.0;
        double actualResult = myCredit.depositAmount(321, depositValue);
        check(expectedResult, actualResult, "Regular deposit >>> Credit card balance is: " + actualResult);
    }

    void withdrawTestToZero() {
        CreditCard myCredit = new CreditCard(123, 321);
        myCredit.setBalance(20.0);
        double withdrawValue = 20.0;
        double expectedResult = 0.0;
        double actualResult = myCredit.withdrawAmount(321, withdrawValue);
        check(expectedResult, actualResult, "Withdraw to Zero >>> Credit card balance is: " + actualResult);
    }

    void withdrawTestToPositive() {
        CreditCard myCredit = new CreditCard(123, 321);
        myCredit.setBalance(20.0);
        double withdrawValue = 7.0;
        double expectedResult = 13.0;
        double actualResult = myCredit.withdrawAmount(321, withdrawValue);
        check(expectedResult, actualResult, "Withdraw to Positive >>> Credit card balance is: " + actualResult);
    }

    void withdrawTestToNegative() {
        CreditCard myCredit = new CreditCard(123, 321);
        double withdrawValue = 20.0;
        double expectedResult = -20.0;
        double actualResult = myCredit.withdrawAmount(321, withdrawValue);
        check(expectedResult, actualResult, "Withdraw to Negative >>> Credit card balance is: " + actualResult);
    }

    void depositWithDebtCoverTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        myCredit.setCreditDebt(5.0);
        double depositValue = 25.0;
        double expectedResult = 20.0;
        double actualResult = myCredit.depositAmount(321, depositValue);
        check(expectedResult, actualResult, "Deposit with FULL debt cover >>> Credit card balance is: " + actualResult);
    }

    void depositWithPartDebtCoverTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        myCredit.setCreditDebt(10.0);
        double depositValue = 6.0;
        myCredit.depositAmount(321, depositValue);
        double expectedResult = 4.0;
        double actualResult = myCredit.getCreditDebt();
        check(expectedResult, actualResult, "Deposit with PART debt cover >>> Credit card balance is: " + actualResult);
    }

    void withdrawWithoutExceedingTheLimitTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        myCredit.setCreditLimit(15.0);
        myCredit.setCreditDebt(1.0);
        double withdrawValue = 14.0;
        double expectedResult = -14.0;
        double actualResult = myCredit.withdrawAmount(321, withdrawValue);
        check(expectedResult, actualResult, "Withdraw amount below Credit Limit >>> Credit card balance is: " + actualResult);
    }

    void withdrawExceedingTheLimitTest() {
        CreditCard myCredit = new CreditCard(123, 321);
        myCredit.setCreditLimit(15.0);
        myCredit.setCreditDebt(5.0);
        double withdrawValue = 25.0;
        double expectedResult = 0.0;
        double actualResult = myCredit.withdrawAmount(321, withdrawValue);
        check(expectedResult, actualResult, "Withdraw exceeds Credit Limit >>> Credit card balance is: " + actualResult);
    }

    void check(double expectedResult, double actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}