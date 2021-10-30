package student_oleg_kozlov.lesson_13.level_5;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.*;

// Task_27, Task_28, Task_29, Task_30, Task_31, Task_32
public class StringCalculatorTest {

    private StringCalculator calculator = new StringCalculator();

    @Test
    public void shouldReturnZeroWhenEmptyInput() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void shouldReturnProvidedNumberWhenOnlyOneNumberProvided() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void shouldReturnSumWhenTwoNumbersProvidedSeparatedByComma() {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void shouldReturnSumWhenFiveNumbersProvidedSeparatedByComma() {
        assertEquals(11, calculator.add("1,2,4,1,3"));
    }

    @Test
    public void shouldReturnSumWhenProvidedNumbersSeparatedByCommaAndNewLineSymbol() {
        assertEquals(10, calculator.add("1\n2,3\n4"));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionIfInputEndsWithNewLineSymbol() {
        assertThatThrownBy(() -> calculator.add("1\n"))
                .hasMessage("Provided string can't be ended by New Line symbol!")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void shouldReturnSumWhenProvidedCustomDelimiterAndNumbers() {
        assertEquals(3, calculator.add("//[;]\n1;2"));
    }

    @Test
    public void shouldReturnSumWhenProvidedSeveralCustomDelimitersAndNumbers() {
        assertEquals(6, calculator.add("//[;][&]\n1;2&3"));
    }

    @Test
    public void shouldReturnSumWhenProvidedDefaultAndCustomDelimitersAndNumbers() {
        assertEquals(10, calculator.add("//[:][&]\n1:2&3,1\n3"));
    }

}