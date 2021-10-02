package teacher.lesson_10_srp.lessoncode.oldversion;

public class FraudRule1 extends FraudRule {

    FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
