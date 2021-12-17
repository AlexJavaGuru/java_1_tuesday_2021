package student_sergej_pereligin.lesson_9.level_4.Task_12;


public class FahrenheitConverter implements TemperatureConverter {


    @Override
    public double convert(double celsiusTemperature) {
        return (1.8 * celsiusTemperature + 32);
    }
}
