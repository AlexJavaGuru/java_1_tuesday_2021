package student_einars_marhilevics.lesson_7.level_6;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositOne();
        creditCardTest.depositTwo();
        creditCardTest.withdrawOne();
        creditCardTest.withdrawTwo();
    }
    void depositOne() {
        CreditCard creditCard = new CreditCard(12345,1234);
        int result = creditCard.deposit(1234,100);
        check(result == 100, "depositOne");
    }
    void depositTwo() {
        CreditCard creditCard = new CreditCard(12345,1234);
        creditCard.setCreditLimit(300);
        creditCard.withdraw(1234,200);
        int result = creditCard.deposit(1234,600);
        check(result == 400, "depositTwo");
    }
    void withdrawOne() {
        CreditCard creditCard = new CreditCard(1234,1234);
        creditCard.deposit(1234,1000);
        int result = creditCard.withdraw(1234,200);
        check(result == 800, "withdrawOne");
    }
    void withdrawTwo() {
        CreditCard creditCard = new CreditCard(1234,1234);
        creditCard.setCreditLimit(300);
        creditCard.deposit(1234,100);
        int result = creditCard.withdraw(1234,500);
        check(result == -400, "withdrawTwo");
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
