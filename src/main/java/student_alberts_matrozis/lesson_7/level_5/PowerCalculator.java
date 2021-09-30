package student_alberts_matrozis.lesson_7.level_5;

class PowerCalculator {
    public double powerCalculator(int num, int power) {
        if (power == 0) {
            return 1;
        } else {
            double result = num;
            for (int i = 1; i < Math.abs(power); i++) {
                result = result * num;
            }
            if (power < 0) {
                return 1 / result;
            } else {
                return result;
            }
        }
    }
}
