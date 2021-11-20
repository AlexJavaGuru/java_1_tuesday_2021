package student_julija_kuzmicova.lesson_10.level_4;

//Task_24, Task_25, Task_26, Task_27, Task_28, Task_29, Task_32
class FraudDetectorV2Test {

    private FraudRule[] fraudRules = {
            new FraudRule1("Rule1"),
            new FraudRule2("Rule2"),
            new FraudRule3("Rule3"),
            new FraudRule4("Rule4"),
            new FraudRule5("Rule5")
    };

    FraudDetectorV2 detectorV2 = new FraudDetectorV2(fraudRules);

    public static void main(String[] args) {

        FraudDetectorV2Test test = new FraudDetectorV2Test();
        test.isFraudPokemonReturnTrue();
        test.isFraudSAmountReturnTrue();
        test.isFraudSidneyReturnTrue();
        test.isFraudJamaicaReturnTrue();
        test.isFraudGermanyAndAmountReturnTrue();
        test.isFraudGermanyReturnFalse();
        test.isFraudAmountReturnFalse();
        test.isFraudReturnFalse();
    }

    void isFraudPokemonReturnTrue() {
        Transaction t = new Transaction(new Trader("Pokemon", "City1", "Country1"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true,"Rule1");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudPokemonReturnTrue");
    }

    void isFraudSAmountReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Country1"), 1000001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true,"Rule2");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudSAmountReturnTrue");
    }

    void isFraudSidneyReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "Sidney", "Country1"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true,"Rule3");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudSidneyReturnTrue");
    }

    void isFraudJamaicaReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Jamaica"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true,"Rule4");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudJamaicaReturnTrue");
    }

    void isFraudGermanyAndAmountReturnTrue() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Germany"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true,"Rule5");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudGermanyAndAmountReturnTrue");
    }

    void isFraudGermanyReturnFalse() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Germany"), 900);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false,"null");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudGermanyReturnFalse");
    }

    void isFraudAmountReturnFalse() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Country1"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false,"null");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudAmountReturnFalse");
    }

    void isFraudReturnFalse() {
        Transaction t = new Transaction(new Trader("Name1", "City1", "Country1"), 1001);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false,"null");
        checkResult(expectedResult, detectorV2.isFraud(t), "isFraudReturnFalse");
    }


    void checkResult(FraudDetectionResult expectedResult, FraudDetectionResult actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
