package student_josifs_makarenko.lesson_6.level4;

public class WhileInfiniteLoopBreak {
    int i;

    public void infinityLoop() {
        while (true) {
            System.out.println(i++);
            break;
        }
    }
}
