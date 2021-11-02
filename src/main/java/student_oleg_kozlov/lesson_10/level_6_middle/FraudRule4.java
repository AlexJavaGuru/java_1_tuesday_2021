package student_oleg_kozlov.lesson_10.level_6_middle;

// Task_30
class FraudRule4 extends FraudRule {

    FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Ямайка");
    }
}
