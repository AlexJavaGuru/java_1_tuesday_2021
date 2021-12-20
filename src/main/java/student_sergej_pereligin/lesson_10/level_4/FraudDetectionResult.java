package student_sergej_pereligin.lesson_10.level_4;

public class FraudDetectionResult{
        private boolean fraud;
        private String ruleName;

        public FraudDetectionResult(boolean fraud, String ruleName) {
            this.fraud = fraud;
            this.ruleName = ruleName;
        }

        public boolean isFraud() {
            return fraud;
        }

        public String getRuleName() {
            return ruleName;
        }
}
