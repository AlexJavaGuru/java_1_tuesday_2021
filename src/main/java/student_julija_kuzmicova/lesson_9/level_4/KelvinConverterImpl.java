package student_julija_kuzmicova.lesson_9.level_4;

//Task_12
class KelvinConverterImpl implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
