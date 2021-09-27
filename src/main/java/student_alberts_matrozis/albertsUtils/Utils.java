package student_alberts_matrozis.albertsUtils;

public class Utils {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\033[0m";

    public static void check(String exceptedResult, String receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println(GREEN + "Test passed!" + RESET);
        } else {
            System.out.println(RED + "Test failed!" + RESET);
        }
    }

    public static void check(boolean exceptedResult, boolean receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println(GREEN + "Test passed!");
        } else {
            System.out.println(RED + "Test failed!");
        }
    }

    public static void check(int exceptedResult, int receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println(GREEN + "Test passed!" + RESET);
        } else {
            System.out.println(RED + "Test failed!" + RESET);
        }
    }

    public static void check(double exceptedResult, double receivedResult) {
        if (exceptedResult == receivedResult) {
            System.out.println(GREEN + "Test passed!" + RESET);
        } else {
            System.out.println(RED + "Test failed!" + RESET);
        }
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
            System.out.println(GREEN + "Test passed!" + RESET);
        } else {
            System.out.println(RED + "Test failed!" + RESET);
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
            System.out.println(GREEN + "Test passed!" + RESET);
        } else {
            System.out.println(RED + "Test failed!" + RESET);
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
