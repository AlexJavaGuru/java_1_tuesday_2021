package student_daniel;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("It's Daniel");
        System.out.println("From Jurmala");

        int age = 10;
        age = 100;
        System.out.println(age);

        int varA = 5;
        int varB = 10;

        long firstResult;
        boolean isHungry = true;
        boolean isOpen = false;

        char someChar = '3';

        String myText = "Hola Amigos \"string\" ";
        System.out.println(myText);

        int a = 10;
        int b = 4;
        int result = a / b;
        System.out.println(result);

        int x = 10;
        int y = 4;
        double resultTwo = x / y;
        System.out.println(resultTwo);

        int xx = 10;
        int yy = 4;
        double resultThree = (double) xx / yy;
        System.out.println(resultThree);




        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter variables for first calculations:");
        int varOne = myScanner.nextInt();
        int varTwo = myScanner.nextInt();
        System.out.println("Result value =" + varOne + varTwo);

        System.out.println("Enter variables for second calculations:");
        int varThree = myScanner.nextInt();
        int varFour = myScanner.nextInt();
        System.out.println("Result value =" + (double) varThree / varFour);

    }
}
