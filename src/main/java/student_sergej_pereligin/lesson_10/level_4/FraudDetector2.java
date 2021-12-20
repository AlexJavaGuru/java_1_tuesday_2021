package student_sergej_pereligin.lesson_10.level_4;

import java.util.List;

public class FraudDetector2 {
    List<FraudRule> fraudRule;

    public FraudDetector2(List<FraudRule> fraudRule) {
        this.fraudRule = fraudRule;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRule) {
            if (fraudRule.isFraud(t)) {
                System.out.println("Fraud confirmed");
                System.out.println(t);
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}
