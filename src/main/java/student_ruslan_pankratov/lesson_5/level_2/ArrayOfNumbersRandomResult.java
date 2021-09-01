package student_ruslan_pankratov.lesson_5.level_2;

//Task_13
class ArrayOfNumbersRandomResult {
    public static void main(String[] args) {
        int numberOne = (int) (Math.random() * 90 + 10);
        int numberTwo = (int) (Math.random() * 90 + 10);
        int numberThree = (int) (Math.random() * 30 - 5);

        int[] number = {numberOne, numberTwo, numberThree};
        int result = number[0] + number[1] + number[2];
        System.out.println(result);
    }
}
