package student_oleg_kozlov.lesson_6.level_4;

// Task_19
class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        for ( ; ; ) {
            if (i > 5) {
                break;
            }
            System.out.println("Loop iteration " + i);
            i++;
        }
    }
}
