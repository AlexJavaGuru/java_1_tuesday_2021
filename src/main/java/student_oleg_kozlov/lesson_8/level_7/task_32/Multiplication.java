package student_oleg_kozlov.lesson_8.level_7.task_32;

// Task_32
class Multiplication extends TwoArgumentMathOperation {
    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
