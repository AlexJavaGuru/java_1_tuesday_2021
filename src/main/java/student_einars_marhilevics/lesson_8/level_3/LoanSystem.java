package student_einars_marhilevics.lesson_8.level_3;

abstract class LoanSystem {
    protected String human;

    public LoanSystem(String human) {
        this.human = human;
    }

    abstract boolean canReceiveLoan(Human human);
}
