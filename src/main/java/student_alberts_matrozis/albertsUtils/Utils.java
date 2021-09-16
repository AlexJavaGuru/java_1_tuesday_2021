package student_alberts_matrozis.albertsUtils;

public class Utils {
    public static void check(String exceptedResult, String receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void check(boolean exceptedResult, boolean receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void check(int exceptedResult, int receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void check(double exceptedResult, double receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void fillArrayWithRandomNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int ) (Math.random() * 100 + 1);
            }
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

    public static void checkArrays(int[] actualArray, int[] receivedArray) {
        boolean passed = false;
        if (actualArray.length != receivedArray.length) {
            passed = false;
        } else {
            for (int i = 0; i < actualArray.length; i++) {
                if (actualArray[i] != receivedArray[i]) {
                    passed = false;
                }
            }
            passed = true;
        }
        if (passed) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void checkArrays(String[] actualArray, String[] receivedArray) {
        boolean passed = false;
        if (actualArray.length != receivedArray.length) {
            passed = false;
        } else {
            for (int i = 0; i < actualArray.length; i++) {
                if (actualArray[i] != receivedArray[i]) {
                    passed = false;
                }
            }
            passed = true;
        }
        if (passed) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static boolean checkArrays(int[][] actualArray, int[][] receivedArray) {
        if (actualArray.length != receivedArray.length) {
            return false;
        } else {
            for (int i = 0; i < actualArray.length; i++) {
                if (actualArray[i].length != receivedArray[i].length) {
                    return false;
                } else {
                    for (int j = 0; j < actualArray[i].length; j++) {
                        if (actualArray[i][j] != receivedArray[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
