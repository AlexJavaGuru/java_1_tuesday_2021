package student_julija_kuzmicova.lesson_10.level_4;

//Task_25
class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        boolean result = false;
        if(t.getAmount() > 1000000) {
            result = true;
        }
        return result;
    }

}
