package student_alberts_matrozis.lesson_9.level_7.myList;

import static student_alberts_matrozis.albertsUtils.Utils.*;

public class MyListImplTest {
    public static void main(String[] args) {
        MyListImplTest test = new MyListImplTest();
        test.addTest();
        test.subTest();
        test.clearTest();
        test.lengthTest();
    }

    public void addTest() {
        MyListImpl list = new MyListImpl();
        list.add("Hello");
        list.add("world!");
        check(list.length(), 2);
    }

    public void subTest() {
        MyListImpl list = new MyListImpl();
        list.add("Hello");
        list.add("world!");
        list.sub();
        check(list.length(), 1);
    }

    public void clearTest() {
        MyListImpl list = new MyListImpl();
        list.add("Hello");
        list.add("world!");
        list.clear();
        check(list.length(), 0);
    }

    public void lengthTest() {
        MyListImpl list = new MyListImpl();
        list.add("Hello");
        list.add("world!");
        check(list.length(), 2);
    }
}
