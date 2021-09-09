package student_oleg_kozlov.lesson_6.level_4;

// Task_20
class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Loop iteration " + (i + 1));
        }
    }
}
