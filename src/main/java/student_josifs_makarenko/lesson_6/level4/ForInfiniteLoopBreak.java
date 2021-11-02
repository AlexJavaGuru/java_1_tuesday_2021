package student_josifs_makarenko.lesson_6.level4;

public class ForInfiniteLoopBreak {
    int i;
    public void infiniteLoop() {
        for (;;) {
            System.out.println(i++);
            break;
        }
    }
}
