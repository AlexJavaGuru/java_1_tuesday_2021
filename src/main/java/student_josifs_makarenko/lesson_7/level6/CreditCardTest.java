package student_josifs_makarenko.lesson_7.level6;
//task_10
public class CreditCardTest {
    public static void main(String[] args) {
        depositTest();
        withdrawTest();
        withdrawTest1();
        depositTest1();

    }

    static void depositTest() {
        CreditCard creditCard = new CreditCard(1234373655, 123);
        int pinCode;
        pinCode = creditCard.getPinCode();
        creditCard.deposit(pinCode, 100);
        check(creditCard.getBalance() == 100, "DepositTest");
    }

    static void  withdrawTest() {
        CreditCard creditCard = new CreditCard(1234373655, 123);
        int pinCode;
        pinCode = creditCard.getPinCode();
        creditCard.setCreditLimit(100);
        creditCard.withdraw(pinCode, 100);
        check(creditCard.getDuty() == -100, "withdrawTest");
    }

    static void  withdrawTest1() {
        CreditCard creditCard = new CreditCard(1234373655, 123);
        int pinCode;
        pinCode = creditCard.getPinCode();
        creditCard.setCreditLimit(100);
        creditCard.deposit(pinCode, 100);
        creditCard.withdraw(pinCode, 50);
        check(creditCard.getBalance() == 50, "withdrawTest");
    }

    static void depositTest1() {
        CreditCard creditCard = new CreditCard(1234373655, 123);
        int pinCode;
        pinCode = creditCard.getPinCode();
        creditCard.deposit(pinCode, 100);
        creditCard.deposit(pinCode, 100);
        check(creditCard.getBalance() == 200, "DepositTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
