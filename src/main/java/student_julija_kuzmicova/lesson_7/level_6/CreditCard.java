package student_julija_kuzmicova.lesson_7.level_6;

//Task_10
class CreditCard {

    private int cardNumber;
    private int cardPIN;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public double getBalance() {
        return balance;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CreditCard(int cardNumber, int cardPIN) {
        this.cardNumber = cardNumber;
        this.cardPIN = cardPIN;
        this.balance = 0.0;
        this.creditDebt = 0.0;
        this.creditLimit = 0.0;
    }

    boolean deposit(int userPIN, double amount) {
        if(userPIN != cardPIN) {
            return false;
        }
        if(creditDebt > 0) {
            creditDebtRepayment(amount);
        } else {
            balance += amount;
        }
        return true;
    }

    boolean withdraw(int userPIN, double amount) {
        if(userPIN != cardPIN) {
            return false;
        }
        if(amount > (creditLimit - creditDebt + balance)) {
            return false;
        }
        if(balance > 0) {
            balanceDecrease(amount);
        } else {
            creditDebt += amount;
        }
        return true;
    }

    double creditDebtRepayment(double amount) {
        if(amount <= creditDebt) {
            creditDebt -= amount;
        } else {
            balance += amount - creditDebt;
            creditDebt = 0;
        }
        return creditDebt + balance;
    }

    double balanceDecrease(double amount) {
        if(balance >= amount){
            balance -= amount;
        } else {
            creditDebt += amount - balance;
            balance = 0;
        }
        return balance + creditDebt;
    }

    public String cardInfo() {
        return "Card number: " + cardNumber + ", PIN: " + cardPIN + ", Balance: " + balance + ", Credit limit: " + creditLimit + ", Credit debt: " + creditDebt;
    }
}
