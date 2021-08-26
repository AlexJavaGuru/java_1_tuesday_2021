package student_ruslan_pankratov.lesson_5.level_5;

//Task_31-33
class ArrayUtil {


    public int[] createArray(int arrayLength) {
        int[] result = new int[arrayLength];
        return result;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i : array) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

    }

}
