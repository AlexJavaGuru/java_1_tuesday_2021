package student_daniel.lesson10.level5;

class FraudRule2 extends FraudRule {
    //Task 22 23 24 25 26 27 28 29
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
