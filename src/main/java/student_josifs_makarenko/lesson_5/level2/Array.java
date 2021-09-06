package student_josifs_makarenko.lesson_5.level2;

import java.util.Random;

public class Array {

    int[] showArray(int[] array) {
        return array;
    }

    int[] showArrayWithCodedNumbers (int[] array) {
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        return array;
    }

    int[] showArrayWithYourNumbers(int[] array,int numberOne, int numberTwo, int numberThree) {
        array [0] = numberOne;
        array [1] = numberTwo;
        array [2] = numberThree;
        return array;
    }

    int[] showArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    int showSumOfNumbersInArray (int[] array) {
        return array[0] + array[1] + array[2];
    }

    int showAverageOfNumbersInArray (int[] array) {
        return (array[0] + array[1] + array[2]) / 3;
    }

    void arrayPlusTwo (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 2;
        }
    }
}
