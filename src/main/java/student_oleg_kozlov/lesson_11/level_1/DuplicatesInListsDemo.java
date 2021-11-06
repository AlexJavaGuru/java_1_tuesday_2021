package student_oleg_kozlov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Task_4
class DuplicatesInListsDemo {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("abc");
        arrList.add("abc");
        arrList.add("abc");
        System.out.println("Array list" + arrList);

        List<String> lnkList = new LinkedList<>();
        lnkList.add("def");
        lnkList.add("def");
        lnkList.add("def");
        System.out.println("Linked list: " + lnkList);
    }
}
