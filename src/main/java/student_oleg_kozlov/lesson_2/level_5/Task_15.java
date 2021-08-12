package student_oleg_kozlov.lesson_2.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А зачем так сложно? =) знаете шутку, про отличия джуна, мидла и сениора?")
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
