package student_sergej_pereligin.lesson_6.level_4;


public class WhileLoopContinue {
    public static void main(String[] args) {
        int[] crab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        while (i < crab.length) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i + " Crab has 8 legs until he doesn't");
            i++;
        }
    }
}
