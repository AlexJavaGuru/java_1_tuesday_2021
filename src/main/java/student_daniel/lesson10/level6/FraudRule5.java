package student_daniel.lesson10.level6;

class FraudRule5 extends FraudRule {
    //Task 30 31 32 33
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Германия") && t.getAmount() > 1000);
    }
}
