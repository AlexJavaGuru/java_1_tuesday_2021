package student_julija_kuzmicova.lesson_10.level_4;

//Task_29, Task_32, Task_33
class FraudDetectorV2 {

    private FraudRule[] fraudRules;

    public FraudDetectorV2(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for(FraudRule rule : fraudRules) {
            if(rule.isFraud(t)) {
                System.out.println("Transaction: " + t);
                System.out.println("Rule: " + rule.getRuleName());
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, "null");
    }
}
