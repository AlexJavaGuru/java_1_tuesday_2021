package student_daniel.lesson3.level7;

class BankDemo {
    //Task 32
    public static void main(String[] args) {
        Bank bankAccount = new Bank("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        double moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
