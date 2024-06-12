package student_julija_kuzmicova.lesson_10.level_4;

//Task_26
class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        boolean result = false;
        if(t.getTrader().getCity().equals("Sidney")) {
            result = true;
        }
        return result;
    }

}
