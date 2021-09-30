package student_alberts_matrozis.albertsUtils;

public class ArrayUtil {
    public static void fillArrayWithRandomNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int ) (Math.random() * 100 + 1);
            }
        }
    }

    public static void reverseArray(String[] inputArray) {
        for (int left = 0, right = inputArray.length - 1;
             left < right; left++, right--) {
            String temp = inputArray[left];
            inputArray[left]  = inputArray[right];
            inputArray[right] = temp;
        }
    }

    public static int calculateNumbersInArray(int[][] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = num + arr[i][j];
            }
        }
        return num;
    }
}
