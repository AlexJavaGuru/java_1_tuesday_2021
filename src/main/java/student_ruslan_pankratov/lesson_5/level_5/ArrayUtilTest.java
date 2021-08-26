package student_ruslan_pankratov.lesson_5.level_5;

//Task_31-33
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(result);

    }

}