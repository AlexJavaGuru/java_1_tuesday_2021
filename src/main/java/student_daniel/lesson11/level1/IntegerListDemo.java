package student_daniel.lesson11.level1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    //Task 3
    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(i);
        }

        intArrayList.add(0, -1);
        intArrayList.add(11, 10);
        System.out.println(intArrayList.size());

        intArrayList.remove(5);

        if(intArrayList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }


        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }

        System.out.println(intArrayList);
    }
}
