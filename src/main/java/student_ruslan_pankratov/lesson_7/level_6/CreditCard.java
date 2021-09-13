package student_ruslan_pankratov.lesson_7.level_6;

class CreditCard {
    private int cardNumber;
    private int pinCodeOfTheCard;
    private int balance;
    private int creditLimit;
    private int loanDebt;

    public CreditCard(int cardNumber, int pinCodeOfTheCard) {
        this.cardNumber = cardNumber;
        this.pinCodeOfTheCard = pinCodeOfTheCard;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }


    void deposit(int pinCode, int desiredAmount) {
        if (this.pinCodeOfTheCard == pinCode) {
            if (loanDebt == 0) {
                balance = balance + desiredAmount;

            } else if (loanDebt < desiredAmount) {
                int sum = desiredAmount - loanDebt;
                loanDebt = 0;
                balance = balance + sum;

            } else {
                loanDebt = loanDebt - desiredAmount;

            }

        } else {
            System.out.println("Не правильный пин-код");
        }

    }

    void withdraw(int pinCode, int desiredAmount) {
        if (this.pinCodeOfTheCard == pinCode) {

            if (balance >= desiredAmount) {
                balance = balance - desiredAmount;
            } else if (loanDebt <= creditLimit) {
                int duty = desiredAmount - balance;
                int dutySum = duty + loanDebt;
                if (dutySum <= creditLimit) {
                    balance = 0;
                    loanDebt = loanDebt + duty;
                }
            } else {
                System.out.println("У вас не достаточно денег для данной операции и ваш долг превышен");
            }
        } else {
            System.out.println("Не правильный пин-код");
        }
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCodeOfTheCard() {
        return pinCodeOfTheCard;
    }

    public void setPinCodeOfTheCard(int pinCodeOfTheCard) {
        this.pinCodeOfTheCard = pinCodeOfTheCard;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
    }
}
