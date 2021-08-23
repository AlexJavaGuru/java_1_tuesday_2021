package student_josifs_makarenko.lesson_3.level7;

public class BankAccount {


    String owner;
    int money;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    BankAccount(int money, String owner) {
        this.owner = owner;
        this.money = money;
    }

    }

