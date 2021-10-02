package student_alberts_matrozis.lesson_7.level_6;

class CreditCard {
    private int cardNumber;
    private int pinCode;
    private int balance = 0;
    private int creditLimit = 0;
    private int credit = 0;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public void changeCreditLimit(int pinCode, int newCreditLimit) {
        if (this.pinCode != pinCode) {
            System.out.println("Pin Code is incorrect!\nDeclined!");
        } else {
            this.creditLimit = newCreditLimit;
            System.out.println("Successfully changed!\nNew Credit Limit is: " + this.creditLimit + "!");
        }
    }

    public void deposit(int pinCode, int amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Pin Code is incorrect!\nDeclined!");
        } else {
            if (this.credit > 0) {
                if (this.credit >= amount) {
                    this.credit = this.credit - amount;
                    System.out.println("Successfully transaction! \nNew balance is: " + this.balance + "!" + "\nNew credit is: " + this.credit + "!");
                } else {
                    this.balance = amount - this.credit;
                    this.credit = 0;
                }
            } else {
                this.balance = this.balance + amount;
                System.out.println("Successfully transaction!\nNew balance is: " + this.balance + "!");
            }
        }
    }

    public void withdraw(int pinCode, int amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Pin Code is incorrect!\nDeclined!");
        } else {
            if (amount > this.balance) {
                if ((amount - this.balance) > this.creditLimit) {
                    System.out.println("Transaction failed!\nCredit limit is full!");
                } else {
                    this.credit = amount - this.balance;
                    this.balance = 0;
                    System.out.println("Successfully transaction! \nNew balance is: " + this.balance + "!" + "\nNew credit is: " + this.credit + "!");
                }
            } else {
                this.balance = this.balance - amount;
                System.out.println("Successfully transaction!\nNew balance is: " + this.balance + "!");
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getCredit() {
        return credit;
    }
}
