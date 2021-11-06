package student_einars_marhilevics.lesson_10.level_4;

class FraudDetector {
    boolean isFraud(Transaction t) {
        boolean result = t.getTrader().getFullName().equals("Pokemon") ||
                t.getAmount() > 1000000 ||
                t.getTrader().getCity().equals("Sidney") ||
                t.getTrader().getCountry().equals("Ямайка") ||
                (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000);
        return result;
    }
}
