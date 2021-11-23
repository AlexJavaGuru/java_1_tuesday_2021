package student_alberts_matrozis.lesson_9.level_7.task_28;

public class KelvinToFahrenheitConverter implements ConvertStrategy {

    @Override
    public double convert(double temperature) {
        double fahrenheit = (temperature - 273.15) * 1.8 + 32;
        return Math.round(fahrenheit * 100.0) / 100.0;
    }
}
