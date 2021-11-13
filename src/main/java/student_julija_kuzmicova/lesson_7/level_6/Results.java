package student_julija_kuzmicova.lesson_7.level_6;

import java.util.Objects;

class Results {

    private boolean isSuccess;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    public Results() {
    }

    public Results(boolean isSuccess, double balance, double creditLimit, double creditDebt) {
        this.isSuccess = isSuccess;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.creditDebt = creditDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results results = (Results) o;
        return isSuccess == results.isSuccess && Double.compare(results.balance, balance) == 0 && Double.compare(results.creditLimit, creditLimit) == 0 && Double.compare(results.creditDebt, creditDebt) == 0;
    }
}
