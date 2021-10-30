package student_oleg_kozlov.lesson_9.level_7.Task_25;

// Task_25
class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(int... numbers){
        return strategy.doOperation(numbers);
    }
}
