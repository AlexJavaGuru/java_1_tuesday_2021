package teacher.lesson_11_collections.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        System.out.println(integers);
        System.out.println(integers.size());

        for (Integer integer : integers) {
            System.out.println("Index: " + integers.indexOf(integer) + " number: " + integer);
        }
        integers.remove(5);

        integers.add(11);
        System.out.println(integers.size());

        for (Integer integer : integers) {
            System.out.println("Index: " + integers.indexOf(integer) + " number: " + integer);
        }
    }
}
