package student_julija_kuzmicova.lesson_6.level_4;

//Task_20
class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10) {
            if(i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print("i = " + i + "; ");
            i++;
        }
    }
}
