package student_daniel.lesson10.level6;

public class FraudDetectorDemo {
    //Task 30 31 32 33
    public static void main(String[] args) {
        FraudRule[] fraudRules = {
                new FraudRule1("Fraud by Fullname"),
                new FraudRule2("Fraud by Amount"),
                new FraudRule3("Fraud by City"),
                new FraudRule4("Fraud by Country"),
                new FraudRule5("Fraud by Country and Amount"),
        };

        //Color Theme
        String resetColor = "\u001B[0m";
        String redColor = "\u001B[31m";
        String blueColor = "\u001B[36m";
        String greenColor = "\u001B[32m";

        FraudDetector myFraud = new FraudDetector(fraudRules);
        Transaction thisTransaction = new Transaction(new Trader("Chucky", "Hanover", "Германия"), 1001);
        FraudDetectionResult result = myFraud.isFraud(thisTransaction);

        System.out.println();
        System.out.println("This is fraud: "
                + blueColor + result.isFraud() + resetColor + ", by this rule: "
                + blueColor + result.getRuleName() + resetColor);
        System.out.println("Transaction details: Full name = "
                + blueColor + result.getFullName() + resetColor + ", City = "
                + blueColor + result.getCity() + resetColor + ", Country = "
                + blueColor + result.getCountry() + resetColor);
    }
}
