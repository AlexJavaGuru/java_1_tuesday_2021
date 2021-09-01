package student_ruslan_pankratov.lesson_4.level_3;

import java.util.Scanner;

//Task_10
class NumberMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three integers");
        int result = scanner.nextInt();
        int result2 = scanner.nextInt();
        int result3 = scanner.nextInt();


        if ((result > result2) && (result2 > result3)) {
            System.out.println("Largest number " + result);
        } else if ((result < result2) && (result2 < result3)) {
            System.out.println("Largest number " + result3);
        } else {
            System.out.println("Largest number " + result2);
        }

    }
}