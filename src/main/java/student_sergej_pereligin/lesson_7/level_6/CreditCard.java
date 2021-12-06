package student_sergej_pereligin.lesson_7.level_6;


public class CreditCard {

    int cardNumber;
    int pin;
    double balance;
    double creditLimit;
    double debt;

    public CreditCard(int cardNumber, int pin, double balance, double creditLimit, double debt) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.debt = debt;
    }

    public boolean isPinCheck(int pin) {
        if (this.pin == pin) {
            System.out.println("Pin code is correct, you may proceed.");
        } else {
            System.out.println("Pin is wrong, go to hell.");
        }
        return true;
    }

    public double deposit(int pin, double depositSum) {
        if (isPinCheck(pin)) {
            double diff;
            if (debt < depositSum) {
                diff = (depositSum - debt);
                balance = diff + balance;
                debt = 0;
            } else if (debt == depositSum) {
                debt = debt - depositSum;
            } else if (debt > depositSum) {
                debt = debt - depositSum;
            } else if (debt == 0) {
                balance = balance + depositSum;
                return balance;
            }
            return 0;
        } else {
            System.out.println("Pin is wrong, go to hell.");
        }
        return 0;
    }


    public double getBalance() {
        return balance;
    }

    public double getDebt() {
        return debt;
    }

    public double withdrawal(int pin, int withdrawalSum) {
        if (isPinCheck(pin)) {
            System.out.println("Pin is correct.");

            if (balance > withdrawalSum) {
                balance = balance - withdrawalSum;

            } else if (balance == withdrawalSum) {
                balance = balance - withdrawalSum;

            } else if (balance < withdrawalSum) {
                double diff;
                diff = withdrawalSum - balance;
                debt = diff;
                balance = 0;
            }
        } else {
            System.out.println("Pin is wrong, go to hell.");
        }
        return 0;
    }


}