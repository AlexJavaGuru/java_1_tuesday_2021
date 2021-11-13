package student_einars_marhilevics.lesson_10.level_6;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }
}
