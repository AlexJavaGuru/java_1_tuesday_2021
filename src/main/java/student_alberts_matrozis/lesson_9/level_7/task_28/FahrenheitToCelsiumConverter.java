package student_alberts_matrozis.lesson_9.level_7.task_28;

public class FahrenheitToCelsiumConverter implements ConvertStrategy {

    @Override
    public double convert(double temperature) {
        double a = (((temperature - 32) * 5) / 9);
        return Math.round(a * 100.0) / 100.0;
    }
}
