package student_sergej_pereligin.lesson_11.level_1;

import java.util.ArrayList;

public class Task2 {
    //List хранит только ссылочные типы, любые объекты, включая сторонние классы. Строки, потоки вывода, другие коллекции.
    //Для хранения примитивных типов данных используются классы-обертки.
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(0, "Amigo");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(list);
        System.out.println("Первое добавление: " + secondList);
        secondList.addAll(1, list);
        System.out.println("Второе добавление в середину: " + secondList);

        ArrayList<String> copyOfSecondList = (ArrayList<String>) secondList.clone();
        secondList.clear();
        System.out.println(copyOfSecondList);

        System.out.println(copyOfSecondList.contains("Hello"));
        System.out.println(copyOfSecondList.contains("Check"));
    }
}