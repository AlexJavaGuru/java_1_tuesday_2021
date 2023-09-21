package student_alberts_matrozis.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Second");
        list.add(0, "First");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);
        list.remove("Second");
        System.out.println(list.isEmpty());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
