package teacher.lesson_6_arrays_while_loop.lessoncode;

public class WhileExample {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("j = " + j);
        }

        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
    }
}
