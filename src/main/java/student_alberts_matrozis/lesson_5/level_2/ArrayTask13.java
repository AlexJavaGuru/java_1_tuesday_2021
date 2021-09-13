package student_alberts_matrozis.lesson_5.level_2;

class ArrayTask13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = (int )(Math.random() * 50 + 1);
        numbers[1] = (int )(Math.random() * 50 + 1);
        numbers[2] = (int )(Math.random() * 50 + 1);

        int sumOfAllNumbers = numbers[0] + numbers[1] + numbers[2];
        System.out.println(sumOfAllNumbers);
    }
}
