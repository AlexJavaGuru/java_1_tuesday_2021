package student_alberts_matrozis.lesson_9.level_4.task_11;

public class CelsiumToFahrenheit implements TemperatureConverter{

    @Override
    public double temperatureConverter(double celsium) {
        return (celsium * 1.8) + 32;
    }
}
