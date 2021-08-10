package teacher.lesson_3_oop_first_look.lessoncode.math;

public class CalcDemo {

    public static void main(String[] args) {
        Calc calculator = new Calc();

        int calcResult = calculator.sum(5, 10);
        System.out.println(calcResult);

        calcResult = calculator.sum(20, 10);
        System.out.println(calcResult);

        calcResult = calculator.sum(20, 100);
        System.out.println(calcResult);
    }
}
