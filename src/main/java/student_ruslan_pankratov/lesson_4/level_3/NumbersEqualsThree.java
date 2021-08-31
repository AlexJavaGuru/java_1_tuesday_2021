package student_ruslan_pankratov.lesson_4.level_3;

import java.util.Scanner;

//Task_8
class NumbersEqualsThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three integers");
        int result = scanner.nextInt();
        int result2 = scanner.nextInt();
        int result3 = scanner.nextInt();

        boolean res = result == result2;
        boolean res2 = result == result3;
        boolean res3 = result2 == result3;

        if (res && res2 && res3) {
            System.out.println("All numbers are equal");
        } else if (res || res2 || res3) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }

    }
}
