package student_ruslan_pankratov.lesson_5.level_2;
//Task_14

class ArrayOfNumbersRandomMean {

    public static void main(String[] args) {
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
            System.out.println(number[i]);
        }
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result = result + number[i];
        }
        double resNumber = (double) result / number.length;
        System.out.println(resNumber);
    }
}
