package student_alberts_matrozis.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int num = 2;
        list.add(num);
        // На всё будут ссылки, только у нум будет 2, то есть одна через переменную num, а вторая через массив.
    }
}
