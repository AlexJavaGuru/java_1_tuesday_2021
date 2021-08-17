package teacher.lesson_4_if_statement.lessoncode;

public class ConditionalStatement {

    public static void main(String[] args) {

        int x = 60;

        if (x > 20 && x < 40 && x != 50 || x == 60) {
            System.out.println("X is between 20 and 40 and not equal 50 OR is equal 50");
        }


        System.out.println(2 | 3);

        boolean rain = false;

        if (!rain) {
            System.out.println("Go outside");
        }
    }
}
