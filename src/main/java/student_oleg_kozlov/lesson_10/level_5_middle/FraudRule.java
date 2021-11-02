package student_oleg_kozlov.lesson_10.level_5_middle;

// Task_22, Task_23
abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
