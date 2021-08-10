package teacher.lesson_3_oop_first_look.lessoncode.bankaccount;

public class BankSystem {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Alex", 1000.0, 1234);

        bankAccount.pin = 0000;
        double money = bankAccount.getMoney(0000, 250.0);
        System.out.println(money);
        System.out.println(bankAccount.money);
    }
}
