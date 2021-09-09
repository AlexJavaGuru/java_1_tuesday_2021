package student_sergej_pereligin.lesson_3.level_7;

public class BankAccount {


        String owner;
        int money;

        BankAccount(String moneyAmount, int money) {
            this.owner = moneyAmount;
            this.money=money;
        }

        String getOwner() {
            return this.owner;
        }

       int getMoney() {
            return this.money;
        }


}
