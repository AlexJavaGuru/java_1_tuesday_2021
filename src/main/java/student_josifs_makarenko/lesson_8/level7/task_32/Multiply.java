package student_josifs_makarenko.lesson_8.level7.task_32;

public class Multiply extends TwoArgumentMathOperation {

    public Multiply(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
