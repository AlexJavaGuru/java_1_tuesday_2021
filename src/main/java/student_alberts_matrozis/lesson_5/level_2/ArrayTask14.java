package student_alberts_matrozis.lesson_5.level_2;

class ArrayTask14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = (int )(Math.random() * 50 + 1);
        numbers[1] = (int )(Math.random() * 50 + 1);
        numbers[2] = (int )(Math.random() * 50 + 1);

        int average = (numbers[0] + numbers[1] + numbers[2]) / 3;

        System.out.println(average);
    }
}
