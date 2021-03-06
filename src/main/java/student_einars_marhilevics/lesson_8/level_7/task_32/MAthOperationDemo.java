package student_einars_marhilevics.lesson_8.level_7.task_32;

class MAthOperationDemo {

    public static void main(String[] args) {
        // build and calculate: 10 + 20
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        System.out.println("Left side Addition result = " + addition.calculate());

        // build and calculate: 50 - 20
        Argument arg3 = new Argument(50);
        Argument arg4 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg3, arg4);
        System.out.println("Right side Subtraction result = " + subtraction.calculate());

        // build and calculate: (10 - 5)
        Argument arg5 = new Argument(10);
        Argument arg6 = new Argument(5);
        MathOperation subtraction1 = new Subtraction(arg5, arg6);
        System.out.println("Left side result = " + subtraction1.calculate());

        // build and calculate: (20 / 5)
        Argument arg7 = new Argument(20);
        Argument arg8 = new Argument(5);
        MathOperation division = new Divide(arg7, arg8);
        System.out.println("Right side result = " + division.calculate());

        // build and calculate: (10 - 5) * (20 / 5)
        MathOperation multiplication = new Multiply(subtraction1, division);
        System.out.println("Result = " + multiplication.calculate());


    }

}
