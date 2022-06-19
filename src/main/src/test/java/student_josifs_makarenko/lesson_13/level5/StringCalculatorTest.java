package student_josifs_makarenko.lesson_13.level5;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void ifBlank() {
        StringCalculator stringCalculator = new StringCalculator();

        assertEquals (0, stringCalculator.add(""));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    void ifIllegalSymbol() {
        StringCalculator stringCalculator = new StringCalculator();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("can't be ended by |new lane rgx|");

        String expectedMessage = "can't be ended by |new lane rgx|";
        stringCalculator.add("\n");
    }

    @Test
    void shouldAdd() {
        StringCalculator stringCalculator = new StringCalculator();

        assertEquals(10, stringCalculator.add("1,2,3,4"));
    }

    @Test
    void shouldAddOnePart() {
        StringCalculator stringCalculator = new StringCalculator();

        assertEquals(stringCalculator.add("//[;]\n1;2)"), 1);
    }


    @Test
    void shouldAddMore() {
        StringCalculator stringCalculator = new StringCalculator();

        assertEquals(stringCalculator.add("//[;][&]\n1;2&3)"), 3);
    }
}