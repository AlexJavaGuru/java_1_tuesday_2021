package student_daniel.lesson10.level5;

class FraudRule5 extends FraudRule {
    //Task 22 23 24 25 26 27 28 29
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Германия") && t.getAmount() > 1000);
    }
}
