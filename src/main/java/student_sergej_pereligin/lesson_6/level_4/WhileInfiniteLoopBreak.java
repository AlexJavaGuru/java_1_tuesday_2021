package student_sergej_pereligin.lesson_6.level_4;


public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i > 0) {
            i++;
            System.out.println(i + " Crab has 8 legs until he doesn't");
            if (i == 21) {
                break;
            }
        }
    }
}
