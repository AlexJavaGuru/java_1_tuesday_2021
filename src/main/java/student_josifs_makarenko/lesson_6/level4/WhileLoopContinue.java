package student_josifs_makarenko.lesson_6.level4;

public class WhileLoopContinue {
    int j;
    public void loopContinue() {
        while (j < 15) {
            if (j % 2 == 0) {
                j++;
                continue;
            }
            System.out.println(j++);
            j++;
        }
    }
}
