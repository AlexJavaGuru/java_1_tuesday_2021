package student_daniel.lesson10.level5;

abstract class FraudRule {
    //Task 22 23 24 25 26 27 28 29
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
