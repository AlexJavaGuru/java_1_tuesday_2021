package student_oleg_kozlov.lesson_10.level_5_middle;

// Task_26
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }
}
