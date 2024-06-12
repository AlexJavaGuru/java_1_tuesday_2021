package student_julija_kuzmicova.lesson_10.level_4;

//Task_17, Task_18, Task_19, Task_20, Task_21
class FraudDetectorTest {

    FraudDetector detector = new FraudDetector();

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.isFraudPokemonReturnTrue();
        test.isFraudAmountReturnTrue();
        test.isFraudSidneyReturnTrue();
        test.isFraudJamaicaReturnTrue();
        test.isFraudGermanyAndAmountReturnTrue();
        test.isFraudGermanyReturnFalse();
        test.isFraudAmountReturnFalse();
        test.isFraudReturnFalse();
    }

    void isFraudPokemonReturnTrue() {
        Transaction t = new Transaction(new Trader("Pokemon", "City1", "Country1"), 1001);
        checkResult(true, detector.isFraud(t), "isFraudPokemonReturnTrue");
    }

    void isFraudAmountReturnTrue() {
        Transaction t = new Transaction(new Trader("Pokemon", "City1", "Country1"), 1000001);
        checkResult(true, detector.isFraud(t), "isFraudAmountReturnTrue");
    }

    void isFraudSidneyReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "Sidney", "Country1"), 1001);
        checkResult(true, detector.isFraud(t), "isFraudSidneyReturnTrue");
    }

    void isFraudJamaicaReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Jamaica"), 1001);
        checkResult(true, detector.isFraud(t), "isFraudJamaicaReturnTrue");
    }

    void isFraudGermanyAndAmountReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Germany"), 1001);
        checkResult(true, detector.isFraud(t), "isFraudGermanyAndAmountReturnTrue");
    }

    void isFraudGermanyReturnFalse() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Germany"), 900);
        checkResult(false, detector.isFraud(t), "isFraudGermanyReturnFalse");
    }

    void isFraudAmountReturnFalse() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Country1"), 1001);
        checkResult(false, detector.isFraud(t), "isFraudAmountReturnFalse");
    }

    void isFraudReturnFalse() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Country1"), 1001);
        checkResult(false, detector.isFraud(t), "isFraudReturnFalse");
    }


    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
