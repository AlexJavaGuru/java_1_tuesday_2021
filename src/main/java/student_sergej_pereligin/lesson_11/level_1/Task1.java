package student_sergej_pereligin.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        System.out.println("ArrayList has %d elements \n"+ people.size());
        for (String person : people) {

            System.out.println(person);
        }
        // проверяем наличие элемента
        if (people.contains("Tom")) {

            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {

            System.out.println(person);
        }

        // V2
        List<String> testArray = new LinkedList<>();
        testArray.add("A");
        testArray.add("BB");
        testArray.add(1, "CCC");
        testArray.add("CCC");
        testArray.add("111");
        testArray.add("CCC");
        testArray.add("222");

        System.out.println(testArray.size());
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


