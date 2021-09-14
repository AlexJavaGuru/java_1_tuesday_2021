package student_einars_marhilevics.lesson_7.level_6;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.deposit();
    }
    void deposit() {
        CreditCard creditCard = new CreditCard(12345,1234);
        int result = creditCard.deposit(1234,100);
        check(result == creditCard.getCardBalance(), "deposit");
    }
    void check (boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        }
        else {
            System.out.println(testName + " failed");
        }
    }
}
