package student_josifs_makarenko.lesson_7.level6;
//task12
import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arrayCopy.copyInRange(array,2, 5)));
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int newLength = 0;
        for (int j : in) {
            if (j >= numberFrom && j <= numberTo) {
                newLength++;
            }
        }

        int[] newArray = new int[newLength];
        int cell = 0;
            for (int j : in) {
                if (j >= numberFrom && j <= numberTo) {
                    newArray[cell] = j;
                    cell++;
                }
            }
        return newArray;
    }
}