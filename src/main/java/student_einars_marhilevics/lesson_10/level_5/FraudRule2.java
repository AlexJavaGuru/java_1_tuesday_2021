package student_einars_marhilevics.lesson_10.level_5;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return false;
    }
}
