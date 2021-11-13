package student_oleg_kozlov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

// Task_3
class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println("After adding to end: " + integers);
        integers.add(0, 1);
        System.out.println("After adding at beginning: " + integers);
        System.out.println("List length = " + integers.size());
        integers.remove(1);
        System.out.println("After removing element with index 1: " + integers);
        integers.remove(Integer.valueOf(4));
        System.out.println("After removing Integer object 4: " + integers);
        System.out.println("List is empty: " + integers.isEmpty());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
