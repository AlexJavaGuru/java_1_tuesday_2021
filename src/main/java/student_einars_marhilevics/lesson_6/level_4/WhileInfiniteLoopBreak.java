package student_einars_marhilevics.lesson_6.level_4;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        while(true) {
            System.out.println("inside while " + i);
            if (i == 5) {
                break;
            }
            i++;
        }
    }
}
