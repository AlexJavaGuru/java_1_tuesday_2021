package student_oleg_kozlov.lesson_10.level_1_intern;

// Task_5
class SafeV2 {
    private String password;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public SafeV2(String password, double amount) {
        this.password = password;
        this.amount = amount;
    }

    public void getMoney(String pass, double amt) {
        if (pass.equals(password) && amt <= amount) {
            amount -= amt;
        }
    }

    public void putMoney(String pass, double amt) {
        if (pass.equals(password)) {
            amount += amt;
        }
    }
}
