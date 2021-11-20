package student_julija_kuzmicova.lesson_10.level_4;

//Task_27
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        boolean result = false;
        if(t.getTrader().getCountry().equals("Jamaica")) {
            result = true;
        }
        return result;
    }

}
