package student_oleg_kozlov.lesson_13.level_1;

import java.math.BigDecimal;

// Task_2, Task_4, Task_5, Task_7, Task_8
class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Income can't be less than 0");
        }
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}
