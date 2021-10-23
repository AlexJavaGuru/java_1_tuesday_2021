package student_alberts_matrozis.lesson_9.level_7.strategy_pattern;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private int cvv;
    private String dateOfExpire;

    public CreditCardStrategy(String name, String cardNumber, int cvv, String dateOfExpire) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpire = dateOfExpire;
    }

    @Override
    public void pay(int amount) {
        String lastFourNumbers = cardNumber.substring(cardNumber.length() - 4);
        System.out.println(amount + " paid with ************" + lastFourNumbers + " |" + name + "|");
    }
}
