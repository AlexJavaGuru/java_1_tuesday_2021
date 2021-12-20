package student_sergej_pereligin.lesson_10.level_4;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sidney")) {
            return true;
        } else {
            return false;
        }
    }
}
