package teacher.lesson_4_if_statement.lessoncode.basictestapproach;

public class Calculator {

    int sum(int variableA, int variableB) {
        return variableA + variableB;
    }

    int dif(int variableA, int variableB) {
        return variableA - variableB;
    }

    boolean isEven(int variable) {
        if (variable % 2 == 0) {
            return true;
        }
        return false;
    }

}
