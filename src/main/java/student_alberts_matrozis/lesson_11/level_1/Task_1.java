package student_alberts_matrozis.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World!");
        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World!");
        System.out.println(linkedList);

        /*
        Арррей - быстро взять, медленно удалять и добавлять

        Линкед - медленно брать, быстро вставлять и удалять

        PS. C братом почти поспорил на 10 баксов что в ближайшие 5 лет я ни разу не буду использовать LinkedList :D
         */
    }
}
