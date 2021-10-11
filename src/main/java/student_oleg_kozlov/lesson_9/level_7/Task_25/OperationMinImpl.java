package student_oleg_kozlov.lesson_9.level_7.Task_25;

// Task_25
class OperationMinImpl implements Strategy {
    @Override
    public double doOperation(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        double result = numbers[0];
        for (int number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }
}
