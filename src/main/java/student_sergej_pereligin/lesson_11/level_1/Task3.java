package student_sergej_pereligin.lesson_11.level_1;

import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<String> testArray = new LinkedList<>();
        testArray.add("A");
        testArray.add("BB");
        testArray.add(1, "CCC");
        testArray.add("CCC");
        testArray.add("111");
        testArray.add("CCC");
        testArray.add("222");
        testArray.add(7, "SSS");

        System.out.println("Size = " + testArray.size());
        System.out.println("Printing array");
        for (String element : testArray) {
            System.out.println(element);
        }

        testArray.remove("CCC");
        testArray.remove(0);
        if (!testArray.isEmpty()) {
            System.out.println("Collection is not empty");
        }
        System.out.println("Printing array");
        for (String element : testArray) {
            System.out.println(element);
        }
    }
}


