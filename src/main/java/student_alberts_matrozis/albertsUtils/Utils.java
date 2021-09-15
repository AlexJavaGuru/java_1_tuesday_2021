package student_alberts_matrozis.albertsUtils;

public class Utils {
    public void check(String exceptedResult, String receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void check(boolean exceptedResult, boolean receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void check(int exceptedResult, int receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void check(double exceptedResult, double receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void fillArrayWithRandomNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int ) (Math.random() * 100 + 1);
            }
        }
    }

    public int calculateNumbersInArray(int[][] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = num + arr[i][j];
            }
        }
        return num;
    }
}
