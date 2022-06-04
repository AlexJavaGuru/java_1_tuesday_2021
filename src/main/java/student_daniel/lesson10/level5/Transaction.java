package student_daniel.lesson10.level5;

class Transaction {
    //Task 22 23 24 25 26 27 28 29
    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
}
