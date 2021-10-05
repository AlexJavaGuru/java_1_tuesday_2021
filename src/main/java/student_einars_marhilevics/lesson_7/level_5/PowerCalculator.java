package student_einars_marhilevics.lesson_7.level_5;

class PowerCalculator {
    int elevate(int number, int degree) {
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }
}
