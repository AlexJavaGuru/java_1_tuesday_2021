package student_einars_marhilevics.lesson_6.level_4;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for(int i=1;i>=1;i++) {
            System.out.println("inside for " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
