package student_ruslan_pankratov.lesson_4.level_1;

import java.util.Scanner;
//Task_4
class EvenOrOdd {
    public static void main(String[] args) {
    method();


    }
   static void method(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if((result%2) == 0){
            System.out.println("The result is even: " + result);
        }else {
            System.out.println("The result is odd: " + result);
        }

    }

}
