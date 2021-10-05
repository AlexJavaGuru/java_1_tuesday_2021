package student_oleg_kozlov.lesson_8.level_7.task_32;

// Task_32
class Division extends TwoArgumentMathOperation {
    public Division(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        double denominator = calculateRightSide();
        return (denominator == 0) ? Double.MAX_VALUE : calculateLeftSide() / denominator;
    }
}
