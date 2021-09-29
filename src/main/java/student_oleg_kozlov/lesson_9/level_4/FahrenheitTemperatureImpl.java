package student_oleg_kozlov.lesson_9.level_4;

// Task_11
class FahrenheitTemperatureImpl implements TemperatureConverterFromCelsius {
    @Override
    public double convertFromCelsius(double celsiusDegrees) {
        return 9.0/5.0 * celsiusDegrees + 32;
    }
}
