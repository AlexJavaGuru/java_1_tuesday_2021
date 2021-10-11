package student_einars_marhilevics.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {

            if (i == 5) {
                i++;
                continue;

            }
            System.out.println("inside while " + i);
            i++;
        }
    }
}
