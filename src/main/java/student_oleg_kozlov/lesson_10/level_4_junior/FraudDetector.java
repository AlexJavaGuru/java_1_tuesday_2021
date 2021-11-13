package student_oleg_kozlov.lesson_10.level_4_junior;

// Task_17, Task_18, Task_19, Task_20, Task_21
class FraudDetector {
    boolean isFraud(Transaction t) {
        boolean result = false;
        if (t.getTrader().getFullName().equals("Pokemon") ||
                t.getAmount() > 1000000 ||
                t.getTrader().getCity().equals("Sidney") ||
                t.getTrader().getCountry().equals("Ямайка") ||
                (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000)) {
            result = true;
        }
        return result;
    }
}
