package teacher.lesson_10_srp.lessoncode.oldversion;

public class FraudRule2 extends FraudRule {
    FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 100000;
    }
}
