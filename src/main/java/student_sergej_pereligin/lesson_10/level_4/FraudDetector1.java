package student_sergej_pereligin.lesson_10.level_4;

public class FraudDetector1 {
    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon") ||
                t.getAmount() > 10000 ||
                t.getTrader().getCity().equals("Sidney") ||
                t.getTrader().getCountry().equals("Jamaica") ||
                t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            return true;
        } else {
            return false;
        }
    }
}
