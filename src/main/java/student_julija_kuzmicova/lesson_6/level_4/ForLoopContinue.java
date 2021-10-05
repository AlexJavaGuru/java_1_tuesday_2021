package student_julija_kuzmicova.lesson_6.level_4;

//Task_20
class ForLoopContinue {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.print("i = " + i + "; ");
        }
    }
}
