package student_alberts_matrozis.lesson_9.level_4.task_11;

public class CelsiumToKelvin implements TemperatureConverter{

    @Override
    public double temperatureConverter(double celsium) {
        return celsium + 273.15;
    }
}
