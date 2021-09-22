package student_daniel.lesson4.level7;

import java.util.Scanner;

class FizzBuzzDemo {
    //Task 22
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        FizzBuzz fizzyResult = new FizzBuzz();
        System.out.println("Please input number");
        System.out.println(fizzyResult.detect(myScanner.nextInt()));
    }
}
