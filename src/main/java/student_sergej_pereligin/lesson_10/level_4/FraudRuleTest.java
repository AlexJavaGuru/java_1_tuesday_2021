package student_sergej_pereligin.lesson_10.level_4;

import java.util.ArrayList;
import java.util.List;

public class FraudRuleTest {
    FraudDetector2 fraudDetector2;

    public static void main(String[] args) {
        FraudRuleTest fraudRuleTest = new FraudRuleTest();
        fraudRuleTest.init();
        fraudRuleTest.pokemonTest();
        fraudRuleTest.amountTest();
        fraudRuleTest.notPokemon();
        fraudRuleTest.badSidney();
        fraudRuleTest.badJamaica();
        fraudRuleTest.badGermanyBadAmount();
        fraudRuleTest.badGermanyGoodAmount();
    }

    void init() {
        List<FraudRule> fraudRule = new ArrayList<>();
        fraudRule.add(new FraudRule1("Rule1"));
        fraudRule.add(new FraudRule2("Rule2"));
        fraudRule.add(new FraudRule3("Rule3"));
        fraudRule.add(new FraudRule4("Rule4"));
        fraudRule.add(new FraudRule5("Rule5"));
        fraudDetector2 = new FraudDetector2(fraudRule);
    }


    void pokemonTest() {
        Trader trader = new Trader("Pokemon", "Taipei", "Taiwan");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "pokemonTest");
    }

    void notPokemon() {
        Trader trader = new Trader("NotPokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "notPokemon");
    }

    void amountTest() {
        Trader trader = new Trader("Slava", "Taipei", "Taiwan");
        Transaction transaction = new Transaction(trader, 11000000);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "Million test");
    }


    void badSidney() {
        Trader trader = new Trader("Slava", "Sydney", "Taiwan");
        Transaction transaction = new Transaction(trader, 6000);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "badSidney");
    }

    void badJamaica() {
        Trader trader = new Trader("Slava", "smth", "Jamaica");
        Transaction transaction = new Transaction(trader, 6000);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "badJamaica");
    }

    void badGermanyBadAmount() {
        Trader trader = new Trader("Slava", "smth", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "badGermanyBadAmount");
    }

    void badGermanyGoodAmount() {
        Trader trader = new Trader("Slava", "smth", "Germany");
        Transaction transaction = new Transaction(trader, 300);
        FraudDetectionResult expectedRes = fraudDetector2.isFraud(transaction);
        checkRes(expectedRes.isFraud(), "badGermanyGoodAmount");
    }

    void checkRes(boolean expectedRes, String testName) {
        if (expectedRes) {
            System.out.println("Test " + testName + " have been passed!");
        } else {
            System.out.println("Test " + testName + " have been failed!");
        }
    }

}
