package student_ruslan_pankratov.lesson_7.level_5;
//Task_9


class PowerCalculator {

    static int exponentiation(int number, int degree) {
        int sum = number;
        int[] multiplication = new int[degree];

        for (int i = 1; i < multiplication.length; i++) {
            sum = sum * number;
        }
        return sum;
    }
}
