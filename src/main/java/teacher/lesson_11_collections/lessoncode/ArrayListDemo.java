package teacher.lesson_11_collections.lessoncode;

import student_oleg_kozlov.lesson_2.level_7.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("My Name");
        strings.add("Is");
        strings.add("Alex!");

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(4);
        integers.add(3);
        System.out.println(integers);


        int isIndex = strings.indexOf("Is");

        String alexString = strings.get(3);

        System.out.println(alexString);
        System.out.println(isIndex);

        strings.remove("Alex!");
        strings.remove(0);


        Iterator<String> iterator = strings.iterator();
        //Don't use
        while (iterator.hasNext()) {
            String elem = iterator.next();
            if (elem.equals("Is")) {
                iterator.remove();
            }
        }

        List<Book> books = new ArrayList<>();

        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());

        Book book = books.get(3);

    }
}
