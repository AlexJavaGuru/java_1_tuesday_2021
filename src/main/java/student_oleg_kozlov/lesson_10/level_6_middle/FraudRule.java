package student_oleg_kozlov.lesson_10.level_6_middle;

// Task_30, Task_31
abstract class FraudRule {
    private String ruleName;

    public String getRuleName() {
        return ruleName;
    }

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
