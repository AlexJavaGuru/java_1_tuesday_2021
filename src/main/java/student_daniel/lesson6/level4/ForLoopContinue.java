package student_daniel.lesson6.level4;

public class ForLoopContinue {
    //Task 20
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("It's four");
                continue;
            }
            System.out.println(i);
        }
    }
}
