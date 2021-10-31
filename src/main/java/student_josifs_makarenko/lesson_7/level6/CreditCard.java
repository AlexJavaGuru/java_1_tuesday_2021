package student_josifs_makarenko.lesson_7.level6;

import java.util.Scanner;
//task_10
public class CreditCard {

    int cardNumber;
    private int pinCode;
    private int balance = 0;
    private int duty = 0;
    private int creditLimit;

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }


    public int getPinCode() {
        return pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int getDuty() {
        return duty;
    }


    CreditCard (int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    void deposit(int userPinCode, int sum) {
        if (checkPin(userPinCode)) {
            if (balance == 0) {
                balance = balance + sum;
            } else {
                balance = balance + sum + duty;
            }
        } else {
            System.out.println("Your pin is not correct!");
            System.out.println("Try Again");
            deposit(pinCode, sum);
        }
    }

    void withdraw(int userPinCode, int sum) {

        if (checkPin(userPinCode)) {
            if (sum < getBalance()) {
                balance = getBalance() - sum;
            } else if (sum >= balance && creditLimit >= duty) {
                duty = balance;
                duty = balance - sum;
                balance = 0;
            } else if(duty == 0 && (balance - sum + creditLimit) < 0) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Your sum is so large");
                System.out.println("input another");
                int sum1 = scanner.nextInt();
                withdraw(pinCode, sum1);
            } else {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Your sum is so large");
                System.out.println("input another");
                int sum1 = scanner.nextInt();
                withdraw(pinCode, sum1);
            }
        } else {
            System.out.println("Your pin is not correct!");
            System.out.println("Try Again");
            withdraw(pinCode, sum);
        }
    }

    boolean checkPin(int userPinCode) {
        return getPinCode() == userPinCode;
    }
}
