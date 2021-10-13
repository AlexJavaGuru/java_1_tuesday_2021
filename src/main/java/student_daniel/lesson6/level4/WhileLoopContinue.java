package student_daniel.lesson6.level4;

public class WhileLoopContinue {
    //Task 20
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                System.out.println("It's Four");
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
