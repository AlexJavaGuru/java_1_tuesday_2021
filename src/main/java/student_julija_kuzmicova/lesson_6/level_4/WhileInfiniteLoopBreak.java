package student_julija_kuzmicova.lesson_6.level_4;

//Task_19
class WhileInfiniteLoopBreak {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10) {
            if(i == 3) {
                break;
            }
            System.out.print("i = " + i + "; ");
            i++;
        }
    }
}
