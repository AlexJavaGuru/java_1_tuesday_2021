package student_einars_marhilevics.lesson_10.level_1;

class SafeVolTwo {
    int pinCode;
    int amount;

    SafeVolTwo(int pinCode, int amount) {
        this.pinCode = pinCode;
        this.amount = amount;
    }

    void getMoney(int code, int withdraw){
        if (code == pinCode) {
            amount -= withdraw;
        }
    }

    void putMoney(int code, int cashIn){
        if (code == pinCode) {
            amount += cashIn;
        }
    }

    public int getAmount() {
        return amount;
    }
}
