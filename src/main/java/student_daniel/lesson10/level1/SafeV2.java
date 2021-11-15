package student_daniel.lesson10.level1;

class SafeV2 {
    //Task 5
    private int pin;
    private double amount;

    public SafeV2(int pin, double amount) {
        this.pin = pin;
        this.amount = amount;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void putMoney(int pin, double amount) {
        if (this.pin == pin) {
            this.amount += amount;
        }
    }

    public void getMoney(int pin, double amount) {
        if (this.pin == pin) {
            this.amount -= amount;
        }
    }
}
