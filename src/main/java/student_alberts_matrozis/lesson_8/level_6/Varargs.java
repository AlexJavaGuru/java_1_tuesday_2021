package student_alberts_matrozis.lesson_8.level_6;

import java.util.ArrayList;

class Varargs {

    public static void main(String[] args) {
        System.out.println(findMax(22, 9, 23, 33, 5, 6, 7, 8, 10, 22));
    }

    public static int findMax(int ...a) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i : a) {
            numbers.add(i);
        }
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
