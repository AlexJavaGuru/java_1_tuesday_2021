package student_alberts_matrozis.lesson_10.level_1.task_5;

class Safe {
    private int pinCode;
    private int moneyAmount;

    public Safe(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public boolean getMoney(int pinCode, int moneyAmount) {
        if (this.pinCode == pinCode) {
            if (moneyAmount > getMoneyAmount()) return false;
            this.moneyAmount = getMoneyAmount() - moneyAmount;
            return true;
        }
        return false;
    }

    public void putMoney(int pinCode, int moneyAmount) {
        if (this.pinCode == pinCode) {
            this.moneyAmount = getMoneyAmount() + moneyAmount;
        }
    }
}
