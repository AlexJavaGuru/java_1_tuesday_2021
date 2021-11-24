package student_julija_kuzmicova.lesson_11.level_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Task_3
class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(2);
        System.out.println(list);
        list.add(7);
        System.out.println("Number was added to the end: " + list);
        list.add(0,3);
        System.out.println("Number was added to the begin: " + list);
        System.out.println("Length is " + list.size());
        list.remove(2);
        System.out.println("Number 20 was deleted by index" + list);
        list.remove(Integer.valueOf(2));
        System.out.println("Number 2 was deleted by number" + list);
        System.out.println("Is list empty? " + list.isEmpty());
        for(Integer integer : list) {
            System.out.println(integer);
        }

    }
}
