package student_einars_marhilevics.lesson_7.level_6;

class CreditCard {
    int cardNumber;
    int pinCode;
    int cardBalance;
    int creditLimit;
    int cardDebt;

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCardDebt() {
        return cardDebt;
    }
    public CreditCard (int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        cardBalance = 0;
        cardDebt = 0;
        creditLimit = 0;
    }
    boolean deposit(int pinCode, int amount) {
        if (this.pinCode != pinCode) {
            return false;
        } else {
            if (cardDebt > 0) {
                amount = decreaseDebt(amount);
            }
            if (amount > 0) {
                cardBalance += amount;
            }
        }
        return true;
    }
    boolean withdraw (int pinCode, int amount) {
        if (this.pinCode != pinCode) {
            return false;
        } else {
            if (cardBalance > 0) {
                amount = decreaseBalance(amount);
            }
            if (amount > 0) {
                cardDebt += amount;
            }
        }
        return true;
    }
    int decreaseDebt(int amount) {
        int dif = 0;
        cardDebt -= amount;
        if (cardDebt < 0) {
            dif = cardDebt * (-1);
        }
        return dif;
    }
    int decreaseBalance(int amount) {
        int dif = 0;
        cardBalance -= amount;
        if (cardBalance < 0) {
            dif = cardDebt * (-1);
        }
        return dif;
    }
}
