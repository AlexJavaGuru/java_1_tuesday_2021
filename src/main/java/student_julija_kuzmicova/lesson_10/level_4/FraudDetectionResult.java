package student_julija_kuzmicova.lesson_10.level_4;

import java.util.List;
import java.util.Objects;

//Task_30
class FraudDetectionResult {

    private boolean fraud;
    private String ruleNames;

    public FraudDetectionResult(boolean fraud, String ruleNames) {
        this.fraud = fraud;
        this.ruleNames = ruleNames;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleNames() {
        return ruleNames;
    }

    public void setRuleNames(String ruleNames) {
        this.ruleNames = ruleNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudDetectionResult that = (FraudDetectionResult) o;
        return fraud == that.fraud && Objects.equals(ruleNames, that.ruleNames);
    }
}
