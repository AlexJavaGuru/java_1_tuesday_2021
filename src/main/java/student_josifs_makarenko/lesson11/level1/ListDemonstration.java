package student_josifs_makarenko.lesson11.level1;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//task1, task2
public class ListDemonstration {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Food> link = new LinkedList<>();

        link.add(new Food("Apple"));
        array.add(5);

        System.out.println(link);
        System.out.println(array);
    }
}
