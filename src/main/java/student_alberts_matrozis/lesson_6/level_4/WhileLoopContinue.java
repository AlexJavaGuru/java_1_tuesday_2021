package student_alberts_matrozis.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
