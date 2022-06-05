package student_daniel.lesson7.level6;

class CreditCard {
    //Task 10

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    private final int cardNumber;
    private final int pinCode;
    private double balance = 0.0;
    private double creditLimit = 0.0;
    private double creditDebt = 0.0;


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public double depositAmount(int pin, double amount) {
        if (this.pinCode == pin) {
            if (creditDebt > 0) {
                amount = checkDebtDeposit(amount);
            }
            if (amount > 0) {
                balance += amount;
            }
            return balance;
        }
        return balance;
    }

    public double withdrawAmount(int pin, double amount) {
        if (this.pinCode == pin) {
            if (creditDebt > 0 || creditLimit > 0) {
                amount = checkDebtWithdraw(amount);
            }
            if (amount > creditLimit - creditDebt && creditLimit != 0) {
                System.out.println("Credit limit exceeded!");
                return balance;
            }
            if (amount > 0) {
                balance -= amount;
            }
            return balance;
        }
        return balance;
    }

    public double checkDebtDeposit(double amount) {
        double debtResult = 0;
        creditDebt -= amount;
        if (creditDebt < 0) {
            debtResult = creditDebt * (-1);
        }
        return debtResult;
    }

    public double checkDebtWithdraw(double amount) {
        double limitResult = 0;
        double availableLimit = creditLimit + creditDebt;
        availableLimit -= amount;
        if (creditLimit < 0) {
            limitResult = availableLimit * (-1);
        }
        return amount - limitResult;
    }
}