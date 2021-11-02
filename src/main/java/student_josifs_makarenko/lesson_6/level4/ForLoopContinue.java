package student_josifs_makarenko.lesson_6.level4;

public class ForLoopContinue {
    int i;

    public void loopContinue() {
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i++);
        }
    }
}
