package student_josifs_makarenko.lesson_7.level6;

import java.util.Scanner;
//task_10
public class CreditCardDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();

        System.out.println("Input your Pin");
        System.out.println(creditCard.createCard(1234373655, scanner.nextInt()));

        System.out.println("Input your card limit");
        creditCard.setCreditLimit(scanner.nextInt());

        System.out.println("input pin and sum");
        creditCard.deposit(scanner.nextInt(), scanner.nextInt());

        System.out.println("input pin and sum");
        creditCard.withdraw(scanner.nextInt(), scanner.nextInt());

        System.out.println(creditCard.getBalance());
        System.out.println(creditCard.getDuty());
    }
}
