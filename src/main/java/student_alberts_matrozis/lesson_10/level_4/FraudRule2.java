package student_alberts_matrozis.lesson_10.level_4;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() >= 1000000) {
            return true;
        }
        return false;
    }



}
