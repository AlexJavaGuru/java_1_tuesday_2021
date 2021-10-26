package student_josifs_makarenko.lesson10.level1;
//task5
public class Safe2 {
    private int pin = 1234;
    private int balance;

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    boolean putMoney(int pin, int sum) {
        if (pin == getPin()) {
            balance += sum;
            return true;
        }
        return false;
    }

    boolean getMoney(int pin, int sum) {
        if (pin == getPin()) {
            balance -= sum;
            return true;
        }
        return false;
    }
}
