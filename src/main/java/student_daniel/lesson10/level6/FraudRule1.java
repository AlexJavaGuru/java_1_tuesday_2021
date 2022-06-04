package student_daniel.lesson10.level6;

class FraudRule1 extends FraudRule {
    //Task 30 31 32 33
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
