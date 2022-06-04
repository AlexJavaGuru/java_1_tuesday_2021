package student_daniel.lesson10.level6;

abstract class FraudRule {
    //Task 30 31 32 33
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
