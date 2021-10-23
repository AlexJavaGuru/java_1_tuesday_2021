package student_alberts_matrozis.lesson_9.level_7.myList;

import java.util.Arrays;

public class MyListImpl implements MyList{

    Object[] list = new Object[0];

    @Override
    public void print() {
        System.out.println(Arrays.toString(list));
    }

    @Override
    public void add(Object element) {
        Object[] newList = Arrays.copyOf(list, list.length + 1);
        newList[newList.length - 1] = element;
        list = newList;
    }

    @Override
    public void sub() {
        Object[] newList = Arrays.copyOf(list, list.length - 1);
        list = newList;
    }

    @Override
    public void clear() {
        Object[] newList = new Object[0];
        list = newList;
    }

    @Override
    public int length() {
        return list.length;
    }

    @Override
    public String toString() {
        return "[" + Arrays.toString(list) + "]";
    }
}
