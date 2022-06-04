package student_daniel.lesson10.level6;

import java.util.Objects;

public class FraudDetectionResult extends Trader {
    //Task 30 31 32 33
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName, String fullName, String city, String country) {
        super(fullName, city, country);
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudDetectionResult that = (FraudDetectionResult) o;
        return fraud == that.fraud && Objects.equals(ruleName, that.ruleName);
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{" +
                "fraud=" + fraud +
                ", ruleName='" + ruleName + '\'' +
                '}';
    }
}
