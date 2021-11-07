package student_josifs_makarenko.lesson11.level1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(0, 6);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        System.out.println(integers);
        integers.remove(0);
        System.out.println(integers);
        integers.removeAll(integers);
        System.out.println(integers);
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());
    }
}
