package student_einars_marhilevics.lesson_10.level_4;


public class FraudDetectorTest {
    private static FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        isFraudTestPokemon();
        isFraudTestNotPokemon();
        isFraudTestCity();
        isFraudTestCountryAndAmount();
        isFraudTestAmount();

    }

    private static void isFraudTestPokemon() {

        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);
        checkResult(fraudDetector.isFraud(transaction),"isFraudTestPokemon");
    }

    private static void isFraudTestNotPokemon() {

        Transaction transaction = new Transaction(new Trader("Pokemon111", "City1", "Country1"), 0);
        checkResult(!fraudDetector.isFraud(transaction),"isFraudTestNotPokemon");
    }

    private static void isFraudTestCity() {

        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Country1"), 0);
        checkResult(fraudDetector.isFraud(transaction),"isFraudTestCity");
    }

    private static void isFraudTestCountryAndAmount() {

        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Germany"), 1000);
        checkResult(fraudDetector.isFraud(transaction),"isFraudTestCountryAndAmount");
    }

    private static void isFraudTestAmount() {

        Transaction transaction = new Transaction(new Trader("Name2", "city", "Mumbay"), 1000001);
        checkResult(fraudDetector.isFraud(transaction), "isFraudTestAmount");
    }


    private static void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " - passed");
        } else {
            System.out.println(testName + " - failed");
        }
    }
}
