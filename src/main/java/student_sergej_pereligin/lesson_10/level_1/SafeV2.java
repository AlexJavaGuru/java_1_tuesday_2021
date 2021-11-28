package student_sergej_pereligin.lesson_10.level_1;


public class SafeV2 {
    public int pin;
    public int amountOfStoredMoney;

    public SafeV2(int pin, int amountOfStoredMoney) {
        this.pin = pin;
        this.amountOfStoredMoney = amountOfStoredMoney;
    }

    public void getMoney(int pin, int amountToTake){
        if (this.pin == pin){
            int actualSum = amountOfStoredMoney - amountToTake;
            System.out.println("Money after extraction: " + actualSum);
        }
        else {
            System.out.println("pin is wrong");
        }
    }

    public void putMoney(int pin, int moneyToPut){
        if (this.pin == pin){
            int actualSum = amountOfStoredMoney + moneyToPut;
            System.out.println("Money after deposit: " + actualSum);
        }
        else {
            System.out.println("Pin is wrong");
        }
    }
}
