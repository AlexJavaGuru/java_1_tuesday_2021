package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        boolean[] booleanArrayExample = new boolean[3];

        booleanArrayExample[0] = true;
//        booleanArrayExample[1] = false;
        booleanArrayExample[2] = true;

        System.out.println("Boolean Array: " + Arrays.toString(booleanArrayExample));


        String[] sayHelloArray = {"Hello", "My", "Name", "Is", "Alex"};
        System.out.println("Boolean Array: " + Arrays.toString(sayHelloArray));

        System.out.println(sayHelloArray[4] + sayHelloArray[3] + sayHelloArray[2]);

        int[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Boolean Array: " + Arrays.toString(integerArray));

        int valueBackup;
        valueBackup = integerArray[4];
        integerArray[0] = 1000;
        integerArray[1] = 2000;
        integerArray[2] = 3000;
        integerArray[3] = 4000;
        integerArray[4] = 5000;
        System.out.println("Boolean Array: " + Arrays.toString(integerArray));
        System.out.println(valueBackup);

//        integerArray[0] = integerArray[0] * 10;
//        integerArray[1] = integerArray[1] * 10;
//        integerArray[2] = integerArray[2] * 10;
//        integerArray[3] = integerArray[3] * 10;
//        integerArray[4] = integerArray[4] * 10;
//        System.out.println("Boolean Array: " + Arrays.toString(integerArray));
    }
}
