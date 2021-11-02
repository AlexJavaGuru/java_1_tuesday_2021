package student_oleg_kozlov.lesson_10.level_4_junior;

// Task_17, Task_18, Task_19, Task_20, Task_21
class Transaction {
    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
}
