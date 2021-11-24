package student_julija_kuzmicova.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Task_4
class DuplicatesListDemo {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3000);
        arrayList.add(3000);
        System.out.println(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5000);
        linkedList.add(5000);
        System.out.println(linkedList);
    }
}
