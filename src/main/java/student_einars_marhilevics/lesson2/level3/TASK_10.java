package student_einars_marhilevics.lesson2.level3;

import java.util.Scanner;

        public class TASK_10 {
            public static void main(String[] args) {
                Scanner myScanner = new Scanner(System.in);
                System.out.println("Enter the radius");
                double num = myScanner.nextDouble();
                System.out.println("Perimeter is " + (2 * 3.14 * num));
                System.out.println("Area is " + (3.14 * num * num));

            }
        }
