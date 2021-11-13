package student_oleg_kozlov.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

// Task_25
class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            for (int i = 0; i < 100000000; i++) {
                list.add("item" + i);
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
