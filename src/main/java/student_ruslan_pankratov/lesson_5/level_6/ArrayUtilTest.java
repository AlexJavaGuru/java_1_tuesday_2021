package student_ruslan_pankratov.lesson_5.level_6;

//Task_34-38

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println(" ");
        int[] result = arrayUtil.createArray(10);
        System.out.println("Массив");
        arrayUtil.fillArrayWithRandomNumbers(result);
        arrayUtil.printArrayToConsole(result);
        System.out.println(" ");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println(" ");
        int[] result = arrayUtil.createArray(10);
        System.out.println("Массив");
        arrayUtil.fillArrayWithRandomNumbers(result);
        arrayUtil.printArrayToConsole(result);
        System.out.println("");
        System.out.println("Самое большое число в данном массиве = " + arrayUtil.findMaxNumber(result));


    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println(" ");
        int[] result = arrayUtil.createArray(10);
        System.out.println("Массив");
        arrayUtil.fillArrayWithRandomNumbers(result);
        arrayUtil.printArrayToConsole(result);
        System.out.println("");
        System.out.println("Самое маленькое число в данном массиве = " + arrayUtil.findMinNumber(result));

    }
}