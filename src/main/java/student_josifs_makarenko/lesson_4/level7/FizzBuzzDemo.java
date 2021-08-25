package student_josifs_makarenko.lesson_4.level7;

import java.util.Scanner;

public class FizzBuzzDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("Input number");
        System.out.println(fizzBuzz.detect(scanner.nextInt()));
    }
}
