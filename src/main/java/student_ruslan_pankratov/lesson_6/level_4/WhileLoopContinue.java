package student_ruslan_pankratov.lesson_6.level_4;

//Task_20
class WhileLoopContinue {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        while (a < b) {

            if (a > 15) {
                continue;
            }
            a++;
            System.out.println(a);

        }
    }
}
