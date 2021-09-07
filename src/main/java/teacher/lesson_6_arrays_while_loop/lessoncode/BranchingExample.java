package teacher.lesson_6_arrays_while_loop.lessoncode;

public class BranchingExample {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
