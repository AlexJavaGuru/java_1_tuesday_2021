package student_daniel.lesson11.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    //Task 4
    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(0, -1);
        intArrayList.add(0, -1);
        intArrayList.add(0, -1);
        System.out.println(intArrayList);

        List<String> linkedStringList = new LinkedList<>();
        linkedStringList.add("PineApple");
        linkedStringList.add("PineApple");
        linkedStringList.add("PineApple");
        System.out.println(linkedStringList);
    }
}