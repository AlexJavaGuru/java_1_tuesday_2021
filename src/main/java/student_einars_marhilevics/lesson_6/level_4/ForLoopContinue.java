package student_einars_marhilevics.lesson_6.level_4;

class ForLoopContinue {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("inside for " + i);
        }
    }
}
