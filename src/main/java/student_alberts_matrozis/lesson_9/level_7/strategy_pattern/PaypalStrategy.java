package student_alberts_matrozis.lesson_9.level_7.strategy_pattern;

public class PaypalStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal " + "|" + emailId + "|");
    }
}
