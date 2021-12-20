package student_sergej_pereligin.lesson_10.level_4;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
