package student_daniel.lesson10.level4;

class FraudDetector {
    //Task 17 18 18 20 21
    boolean isFraud(Transaction t) {
        boolean isFraud = false;
        if (t.getTrader().getFullName().equals("Pokemon") ||
                t.getAmount() > 1000000 ||
                t.getTrader().getCity().equals("Сидней") ||
                t.getTrader().getCountry().equals("Ямайка") ||
                (t.getTrader().getCountry().equals("Германия") && t.getAmount() > 1000)) {
            isFraud = true;
        }
        return isFraud;
    }
}