package student_alberts_matrozis.lesson_10.level_4;

import java.util.ArrayList;
import java.util.List;

class FraudDetector {

    FraudRule[] rules;

    public FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        List<String> triggeredRules = new ArrayList<>();
        boolean isFraud = false;
        for (FraudRule rule : rules) {
            if (rule.isFraud(transaction)) {
                triggeredRules.add(rule.getRuleName());
                isFraud = true;
            }
        }
        return new FraudDetectionResult(isFraud, triggeredRules, transaction);
    }
}