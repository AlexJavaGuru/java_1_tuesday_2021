package student_sergej_pereligin.lesson_7.level_6;



import java.util.Arrays;

public class ArrayCopy {


     int[] copyInRange(int[] testInArray, int numberFrom, int numberTo) {
        int count = 0;

        for (int i = 0; i < testInArray.length; i++) {
            if (testInArray[i] >= numberFrom && testInArray[i] <= numberTo) {
                count++;
            }
        }
        int[] returnArray = new int[count];

        int countIndex = 0;
        for (int i = 0; i < testInArray.length; i++) {
            if (testInArray[i] >= numberFrom && testInArray[i] <= numberTo) {

                returnArray[countIndex] = testInArray[i];
                countIndex++;
            }
        }

        return returnArray;


    }

}
