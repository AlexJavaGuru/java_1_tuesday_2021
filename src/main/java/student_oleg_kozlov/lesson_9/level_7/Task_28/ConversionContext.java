package student_oleg_kozlov.lesson_9.level_7.Task_28;

// Task_28
class ConversionContext {
    private ConversionStrategy strategy;

    public ConversionContext(ConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public double runConversion(double temperature) {
        return strategy.doConversion(temperature);
    }
}
