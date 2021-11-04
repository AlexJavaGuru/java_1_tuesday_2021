package student_oleg_kozlov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Task_2
class DataTypesInListsDemo {
    public static void main(String[] args) {
        List<Integer> referenceType1 = new ArrayList<>();
        // Below is commented out due to compilation error
        // List<int> primitiveType1 = new ArrayList<>();

        List<Integer> referenceType2 = new LinkedList<>();
        // Below is commented out due to compilation error
        // List<int> primitiveType2 = new LinkedList<>();
    }
}
