package student_josifs_makarenko;
import java.lang.Math;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("Can you imagine that this program");
        System.out.println("can work like a calculator?");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);

        int diff = num1 / num2;
        System.out.println("diff of these numbers: "+diff);
        in.close();

        int min = 1;
        int max = 6;

        System.out.println("Random Number: " + Math.random()*(max-min+1)+min) ;
    }

        }


