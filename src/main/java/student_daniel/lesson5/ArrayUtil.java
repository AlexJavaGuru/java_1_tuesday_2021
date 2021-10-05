package student_daniel.lesson5;

import java.util.Random;

public class ArrayUtil {

    int[] createArray(int size) {
        int[] resultArray = new int[size];
        return resultArray;
        //return = new int[size]
    }

    void fillRandom(int[] myArray) {
        Random myRandom = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
    }

    int maxNumber(int[] newArray) {
        int max = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] > max) {
                max = newArray[i];
            }
        }
        return max;
    }
}
