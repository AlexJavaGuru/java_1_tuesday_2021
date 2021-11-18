package student_julija_kuzmicova.lesson_9.level_4;

//Task_12
class FahrenheitConverterImpl implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
