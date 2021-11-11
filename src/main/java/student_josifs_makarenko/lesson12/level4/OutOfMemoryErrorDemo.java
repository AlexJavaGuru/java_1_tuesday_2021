package student_josifs_makarenko.lesson12.level4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
            try {
                for (int i = 0; i < 1111111111; i++) {
                    list.add(i);
                }
            } catch (OutOfMemoryError e) {
                System.out.println("ALL WORK");
        }
    }
}
