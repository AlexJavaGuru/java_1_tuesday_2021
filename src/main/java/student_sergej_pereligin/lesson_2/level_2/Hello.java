package student_sergej_pereligin.lesson_2.level_2;


import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите пожалуйста имя!");
        System.out.println("Как понимаю вас зовут:"+scanner.nextLine());
    }
}
