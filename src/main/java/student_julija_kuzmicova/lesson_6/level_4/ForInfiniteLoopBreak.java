package student_julija_kuzmicova.lesson_6.level_4;

//Task_19
class ForInfiniteLoopBreak {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.print("i = " + i + "; ");
        }
    }
}
