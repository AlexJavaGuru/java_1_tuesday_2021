package student_daniel.lesson10.level4;

class Transaction {
    //Task 17 18 18 20 21
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
