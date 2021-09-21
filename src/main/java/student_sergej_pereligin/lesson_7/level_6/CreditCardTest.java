package student_sergej_pereligin.lesson_7.level_6;


public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositTest();
        creditCardTest.withdrawalTest();
        creditCardTest.debtTest();
        creditCardTest.debtTestV2();
        creditCardTest.pinTest();
    }

    public void depositTest() {
        CreditCard creditCard = new CreditCard(222, 123, 100, 10000, 0);
        double expectedResult = 200;
        creditCard.deposit(123, 100);
        double actualResult = creditCard.getBalance();
        checkResults(expectedResult, actualResult, "depositTest");
    }


    public void withdrawalTest() {
        CreditCard creditCard = new CreditCard(222, 123, 100, 10000, 0);
        double expectedResult = 0;
        creditCard.withdrawal(123, 100);
        double actualResult = creditCard.getBalance();
        checkResults(expectedResult, actualResult, "withdrawalTest");
    }

    public void debtTest(){
        CreditCard creditCard = new CreditCard(222,123,100, 10000,50);
        double expectedResult = 0;
        creditCard.deposit(123,50);
        double actualResult = creditCard.getDebt();
        checkResults(expectedResult, actualResult, "debtTest");
    }

    public void debtTestV2(){
        CreditCard creditCard = new CreditCard(222,123,100, 10000,100);
        double expectedResult = 50;
        creditCard.deposit(123,50);
        double actualResult = creditCard.getDebt();
        checkResults(expectedResult, actualResult, "debtTestV2");
    }

    public void pinTest(){
        CreditCard creditCard = new CreditCard(222,123,100, 10000,100);
        boolean expectedResult = true;
        boolean actualResult = creditCard.isPinCheck(123);
        checkResults(actualResult, expectedResult, "PinTest");
    }

    void checkResults(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " passed!");
        } else {
            System.out.println("Teast " + testName + " failed!");
        }
    }
    void checkResults(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " passed!");
        } else {
            System.out.println("Teast " + testName + " failed!");
        }
    }
}
