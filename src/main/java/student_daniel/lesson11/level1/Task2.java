package student_daniel.lesson11.level1;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> linkedStringList = new LinkedList<>();
        linkedStringList.add("PineApple");
        for (String stringsInLinkedList : linkedStringList) {
            System.out.println("LinkedList using primitives: " + stringsInLinkedList);
        }

        List<SomeObj> myObj = new LinkedList<>();
        SomeObj one = new SomeObj("John", "Doe");
        myObj.add(one);
        SomeObj two = myObj.get(0);
        String toPrintStringOutOfObject = two.toString();
        System.out.println("Printing two: " +toPrintStringOutOfObject);
    }
}
