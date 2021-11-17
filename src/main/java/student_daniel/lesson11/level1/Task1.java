package student_daniel.lesson11.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayStringList = new ArrayList<>();
        arrayStringList.add("Apple");
        for (String stringsInArrayList : arrayStringList) {
            System.out.println("ArrayList value: " + stringsInArrayList);
        }

        List<String> linkedStringList = new LinkedList<>();
        linkedStringList.add("PineApple");
        for (String stringsInLinkedList : linkedStringList) {
            System.out.println("LinkedList value: " + stringsInLinkedList);
        }
    }
}
