package student_sergej_pereligin.lesson_2.level_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       int x = scanner.nextInt();
       double z=0.1;
       int month=3;
        double c=x;
        double y=c;
        double q=y*z;;
      double f;
        while(month>0){
            month--;

            c=c*z;

            System.out.println("Остаток по выплате:"+y);
            f=c;
            f=y-c;
            System.out.println("Проценты с выплат:"+f);


        }
}}
