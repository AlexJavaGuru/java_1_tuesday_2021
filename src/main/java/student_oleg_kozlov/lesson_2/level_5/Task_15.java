package student_oleg_kozlov.lesson_2.level_5;

public class Task_15 {

    public static void main(String[] args) {

        System.out.print("Processing");

        for (int i = 0; i < 10; i++) {

            // Pause output for 0,5 sec
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("Exception: " + e.getMessage());
            }

            System.out.print(".");
        }
    }
}
