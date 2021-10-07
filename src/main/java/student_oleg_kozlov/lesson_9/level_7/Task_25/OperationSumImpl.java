package student_oleg_kozlov.lesson_9.level_7.Task_25;

// Task_25
class OperationSumImpl implements Strategy {
    @Override
    public double doOperation(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
