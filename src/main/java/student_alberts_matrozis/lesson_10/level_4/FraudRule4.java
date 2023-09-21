package student_alberts_matrozis.lesson_10.level_4;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

}