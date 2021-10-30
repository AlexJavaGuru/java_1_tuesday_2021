package student_oleg_kozlov.lesson_13.level_1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.*;

// Task_3, Task_4, Task_6, Task_7
public class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenIncomeIsLessThanZero() {
        var income = new BigDecimal(-1);
        assertThatThrownBy(() -> taxCalculator.calculateTax(income))
                .hasMessage("Income can't be less than 0")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("0.00"), taxToPay);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("2500.00"), taxToPay);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("5000.00"), taxToPay);
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("9000.00"), taxToPay);
    }

}