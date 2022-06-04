package student_daniel.lesson7.level5;

public class PowerCalculator {
    //Task 9
    public static int powerCalculation(int value, int multiplyRate) {
        int result = 1;
        for (int i = 1; i <= multiplyRate; i++) {
            result = result * value;
        }
        return result;
    }
}