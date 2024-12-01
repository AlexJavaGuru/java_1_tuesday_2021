package student_sergej_pereligin.lesson_7.level_6;


public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard crabCard = new CreditCard(220693, 123, 600, 10000, 0);

        crabCard.deposit(123, 200);
        crabCard.withdrawal(123, 300);

        System.out.println("Balance is: " + crabCard.getBalance());
        System.out.println("Debt is: " + crabCard.getDebt());
    }
}
