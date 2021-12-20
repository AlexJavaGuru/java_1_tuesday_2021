package student_sergej_pereligin.lesson_10.level_4;

public class Transaction {
    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.amount = amount;
        this.trader = trader;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}
