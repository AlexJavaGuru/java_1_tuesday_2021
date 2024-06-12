package student_julija_kuzmicova.lesson_10.level_4;

//Task_24
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        boolean result = false;
        if(t.getTrader().getFullName().equals("Pokemon")) {
            result = true;
        }
        return result;
    }

}
