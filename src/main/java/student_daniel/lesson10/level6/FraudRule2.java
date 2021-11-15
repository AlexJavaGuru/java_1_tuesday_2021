package student_daniel.lesson10.level6;

class FraudRule2 extends FraudRule {
    //Task 30 31 32 33
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
