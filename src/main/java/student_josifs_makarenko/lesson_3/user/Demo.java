package student_josifs_makarenko.lesson_3.user;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   User user1 = new User();
        System.out.println("Hi user, input your name");
   user1.setName(scanner.nextLine());
    user1.greeting();
    user1.sayMyName();
    }
}
