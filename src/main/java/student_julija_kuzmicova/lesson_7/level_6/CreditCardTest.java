package student_julija_kuzmicova.lesson_7.level_6;

//Task_10
class CreditCardTest {

    CreditCard card = new CreditCard(123456789, 1234);

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.createNewCardTest();
        creditCardTest.changeCreditLimitTest();
        creditCardTest.depositWrongPINTest();
        creditCardTest.depositBalanceWithoutCreditTest();
        creditCardTest.depositBalanceWithCreditTest();
        creditCardTest.withdrawWrongPINTest();
        creditCardTest.withdrawWrongAmountTest();
        creditCardTest.withdrawWithoutCreditTest();
        creditCardTest.withdrawWithCreditTest();

    }

    void createNewCardTest() {
        String expectedResult = "Card number: 123456789, PIN: 1234, Balance: 0.0, Credit limit: 0.0, Credit debt: 0.0";
        checkResult(expectedResult,card.cardInfo(), "createNewCardTest");
    }

    void changeCreditLimitTest() {
        card.setCreditLimit(50.0);
        checkResult(50.0, card.getCreditLimit(), "changeCreditLimitTest");
    }

    void depositWrongPINTest() {
        checkResult(false, card.deposit(111, 500), "depositWrongPINTest");
    }

    void depositBalanceWithoutCreditTest() {
        Results actualResult = getActualResultForDeposit(card, 1234, 20.0);
        Results expectedResult = new Results(true, 20, 50, 0);
        checkResult(expectedResult, actualResult,"depositBalanceWithoutCreditTest");
    }

    void depositBalanceWithCreditTest() {
        card.withdraw(1234, 50);
        Results actualResult = getActualResultForDeposit(card, 1234, 20.0);
        Results expectedResult = new Results(true, 0, 50, 10);
        checkResult(expectedResult, actualResult,"depositBalanceWithCreditTest");
    }

    void withdrawWrongPINTest() {
        CreditCard card = new CreditCard(123456789, 1234);
        checkResult(false, card.withdraw(111, 500), "withdrawWrongPINTest");
    }

    void withdrawWrongAmountTest() {
        CreditCard card = new CreditCard(123456789, 1234);
        checkResult(false, card.withdraw(1234, 500), "withdrawWrongAmountTest");
    }

    void withdrawWithoutCreditTest() {
        card.deposit(1234, 40);
        Results actualResult = getActualResultForWithdraw(card, 1234, 20.0);
        Results expectedResult = new Results(true, 10, 50, 0);
        checkResult(expectedResult, actualResult,"withdrawWithoutCreditTest");
    }

    void withdrawWithCreditTest() {
        Results actualResult = getActualResultForWithdraw(card, 1234, 30.0);
        Results expectedResult = new Results(true, 0, 50, 20);
        checkResult(expectedResult, actualResult,"withdrawWithCreditTest");
    }

    void checkResult(String expectedResult, String actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(double expectedResult, double actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(Results expectedResult, Results actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    private static Results getActualResultForDeposit(CreditCard card, int cardPIN, double amount) {
        Results results = new Results();
        results.setIsSuccess(card.deposit(cardPIN, amount));
        results.setBalance(card.getBalance());
        results.setCreditLimit(card.getCreditLimit());
        results.setCreditDebt(card.getCreditDebt());
        return results;
    }

    private static Results getActualResultForWithdraw(CreditCard card, int cardPIN, double amount) {
        Results results = new Results();
        results.setIsSuccess(card.withdraw(cardPIN, amount));
        results.setBalance(card.getBalance());
        results.setCreditLimit(card.getCreditLimit());
        results.setCreditDebt(card.getCreditDebt());
        return results;
    }
}
