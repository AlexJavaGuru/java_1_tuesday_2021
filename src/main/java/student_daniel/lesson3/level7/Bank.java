package student_daniel.lesson3.level7;

import org.w3c.dom.ls.LSOutput;

class Bank {
    //Task 32
    String owner;
    double money;

    Bank(String owner, double money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public double getMoney() {
        return  money;
    }
}
