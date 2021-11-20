package student_julija_kuzmicova.lesson_10.level_1;

//Task_5
class Safe2 {

    private int pin;
    private double money;

    public Safe2(int pin, double money) {
        this.pin = pin;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void getMoney(int userPin, double amount) {
        if(userPin == pin) {
            money -= amount;
        }
    }

    public void putMoney (int userPin, double amount) {
        if(userPin == pin) {
            money += amount;
        }
    }
}
