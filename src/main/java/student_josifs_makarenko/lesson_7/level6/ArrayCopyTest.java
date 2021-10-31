package student_josifs_makarenko.lesson_7.level6;
//task12
public class ArrayCopyTest {
    public static void main(String[] args) {
        arrayCopyTest();
    }

    static void arrayCopyTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] parentArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] childArray = {2, 3, 4, 5};
        check(checkArrays(arrayCopy.copyInRange(parentArray, 2,5), childArray), "ArrayCopyTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK!" +
                    "\n" +
                    "░░░░░░░░░░░░░██\n" +
                    "░░░░░░░░░░░░█░░█\n" +
                    "░░░░░░░░░░░░█░░█\n" +
                    "░░░░░░░░░░░█░░░█\n" +
                    "░░░░░░░░░░█░░░░█\n" +
                    "████████▄▄█░░░░░███████████▄\n" +
                    "▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░░█\n" +
                    "▓▓▓▓▓▓▓█░░█░░░█▀█░█▀▀░█▀█░░░█\n" +
                    "▓▓▓▓▓▓▓█▀▀█▀▀░█▀▄░█▀░░█▀▀░░░█\n" +
                    "▓▓▓▓▓▓▓█░░█░░░▀░▀░▀▀▀░▀░░░░█\n" +
                    "▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░█\n" +
                    "▓▓▓▓▓▓▓█████░░░░░░░░░░░░░█\n" +
                    "███████▀░░░░▀▀██████████▀");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER!");
            System.out.println("""
                    ░░░░░▄▄▄▀▀▀▀▀▀▀▀▀▄▄▄░░░░░░░░░
                    ░░░▄▀░░░░░░░░░░░░░░░▀▀▄▄░░░░░
                    ░░▄▀░░░░░░░░░░░░░░░░░░░░▀▄░░░
                    ░▄▀░░░░░░░░░░░░░░░░░░░░░░░█░░
                    ░█░░░░░░░░░░░░░░░░░░░░░░░░░█░
                    ▐░░░░░░░░░░░░░░░░░░░░░░░░░░░█
                    █░░░░▀▀█▄▄▄░░░▄▌░░░░░░░░░░░░▐
                    ▌░░░░░▌░██▀█▀▀░░░▄▄▄▄▄░░░░▌░▐
                    ▌░░░░░▀▄▄▄▀░░░░░░▌░▀███▄▄▀░░▐
                    ▌░░░░░░░░░░░░░░░░░▀▄▄▄▄▀░░░▄▌
                    ▐░░░░▐▀░░░░░░░░░░░░░░░░░░░▄▀░
                    ░█░░░▌░░▄▀▀▀▄▄▄░░░░░░░░░░▄▀░░
                    ░░█░░▀░░░░▄▄▄▄░▀▀▌░░▌░░░█░░░░
                    ░░░▀▄░░░░░░░░░▀░░░▄▀░░▄▀░░░░░
                    ░░░░░▀▄▄▄░░░░░░░░░▄▄▀▀░░░░░░░
                    ░░░░░░░░▐▀▀▀▀▀▀▀▀▀░░░░░░░░░░░
                    ░░░░░░░░█░░░░░░░░░░░░░░░░░░░░
                    █▀▀█ █▀▀█ █▀▀ 　 █░░█ █▀▀█ █░░█
                    █▄▄█ █▄▄▀ █▀▀ 　 █▄▄█ █░░█ █░░█
                    ▀░░▀ ▀░▀▀ ▀▀▀ 　 ▄▄▄█ ▀▀▀▀ ░▀▀▀
                    ▒█░▄▀ ▀█▀ ▒█▀▀▄ ▒█▀▀▄ ▀█▀ ▒█▄░▒█ ▒█▀▀█
                    ▒█▀▄░ ▒█░ ▒█░▒█ ▒█░▒█ ▒█░ ▒█▒█▒█ ▒█░▄▄
                    ▒█░▒█ ▄█▄ ▒█▄▄▀ ▒█▄▄▀ ▄█▄ ▒█░░▀█ ▒█▄▄█
                    ▒█▀▄▀█ ▒█▀▀▀ ▀█
                    ▒█▒█▒█ ▒█▀▀▀ █▀
                    ▒█░░▒█ ▒█▄▄▄ ▄░""");
        }
    }

    static boolean checkArrays (int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
