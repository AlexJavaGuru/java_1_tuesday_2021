package student_sergej_pereligin.lesson_10.level_4;

public class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        } else {
            return true;
        }
    }
}
