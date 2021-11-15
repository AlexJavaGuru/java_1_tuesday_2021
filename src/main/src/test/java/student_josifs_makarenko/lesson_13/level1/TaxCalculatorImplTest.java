package student_josifs_makarenko.lesson_13.level1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorImplTest {

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }
}