package student_alberts_matrozis.lesson_7.level_6;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardRunner = new CreditCardTest();
        creditCardRunner.creditCardTest();
    }

    public void creditCardTest() {
        CreditCard Citadele = new CreditCard(4000,1337);
        Citadele.deposit(1336, 100);
        check(0, Citadele.getBalance());
        Citadele.withdraw(1336, 500);
        check(0, Citadele.getCredit());
        check(0, Citadele.getBalance());
        Citadele.deposit(1337, 500);
        check(500, Citadele.getBalance());
        check(0, Citadele.getCredit());
        Citadele.withdraw(1337, 250);
        check(250, Citadele.getBalance());
        check(0, Citadele.getCredit());
        Citadele.withdraw(1337, 300);
        check(250, Citadele.getBalance());
        check(0, Citadele.getCredit());
        Citadele.changeCreditLimit(1337, 500);
        Citadele.withdraw(1337, 300);
        check(0, Citadele.getBalance());
        check(50, Citadele.getCredit());
    }
}
