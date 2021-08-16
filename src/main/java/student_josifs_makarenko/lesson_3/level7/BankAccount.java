package student_josifs_makarenko.lesson_3.level7;

public class BankAccount {
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    String owner;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    int money;

    BankAccount(int money, String owner) {
        this.owner = owner;
        this.money = money;
    }

    }

