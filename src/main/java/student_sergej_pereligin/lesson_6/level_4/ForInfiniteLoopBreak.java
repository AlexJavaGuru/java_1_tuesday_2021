package student_sergej_pereligin.lesson_6.level_4;


public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; i >= 1; i++) {
            System.out.println(i + " Crab has 8 legs until he doesn't");
            if (i == 21) {
                break;
            }
        }
    }
}

