package teacher.lesson_10_srp.lessoncode.oldversion;

public class FraudRule4 extends FraudRule {

    FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Ямайка");
    }
}
