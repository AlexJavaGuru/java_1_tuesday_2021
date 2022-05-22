package student_daniel.lesson11;

import java.util.ArrayList;
import java.util.List;

public class IntegerDemo {
    public static void main(String[] args) {
        List<java.lang.Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(i);
        }
        intArrayList.remove(5);

        intArrayList.add(10);

        intArrayList.contains(5);

        System.out.println(intArrayList);
        System.out.println(intArrayList.size());

        for (java.lang.Integer newArrayList : intArrayList) {
            System.out.println("Index:" + intArrayList.indexOf(newArrayList) + "number:" + newArrayList);
        }
    }
}

