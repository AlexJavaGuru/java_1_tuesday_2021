package student_ruslan_pankratov.lesson_4.level_3;

import java.util.Scanner;

//Task_9
 class NumberIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three integers");
        int result = scanner.nextInt();
        int result2 = scanner.nextInt();
        int result3 = scanner.nextInt();

        if((result < result2)&(result2 < result3)){
            System.out.println("Increasing");
        }else if((result > result2)&(result2 > result3)){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
