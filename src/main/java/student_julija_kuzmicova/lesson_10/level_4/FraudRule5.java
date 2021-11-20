package student_julija_kuzmicova.lesson_10.level_4;

//Task_28
class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        boolean result = false;
        if(t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            result = true;
        }
        return result;
    }

}
