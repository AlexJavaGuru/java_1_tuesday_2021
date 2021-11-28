package student_sergej_pereligin.lesson_9.level_4.Task_12;


public class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
