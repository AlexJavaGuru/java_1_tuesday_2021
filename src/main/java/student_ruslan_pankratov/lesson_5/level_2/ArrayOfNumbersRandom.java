package student_ruslan_pankratov.lesson_5.level_2;

//Task_12
class ArrayOfNumbersRandom {
    public static void main(String[] args) {

        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
            System.out.println(number[i]);
        }
    }
}
