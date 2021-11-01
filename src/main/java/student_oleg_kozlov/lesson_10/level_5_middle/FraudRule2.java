package student_oleg_kozlov.lesson_10.level_5_middle;

// Task_25
class FraudRule2 extends FraudRule {
    FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
