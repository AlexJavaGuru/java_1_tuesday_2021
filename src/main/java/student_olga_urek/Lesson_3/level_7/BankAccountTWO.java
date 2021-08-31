package student_olga_urek.Lesson_3.level_7;

//Task 32

class BankAccountTWO {

    String owner;
    int money;

    BankAccountTWO(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}

class BankAccountDemoTWO {

    public static void main(String[] args) {
        BankAccountTWO bankAccount = new BankAccountTWO("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
