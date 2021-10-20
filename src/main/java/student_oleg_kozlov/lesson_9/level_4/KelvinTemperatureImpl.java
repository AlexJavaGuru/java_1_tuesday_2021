package student_oleg_kozlov.lesson_9.level_4;

// Task_11
class KelvinTemperatureImpl implements TemperatureConverterFromCelsius {
    @Override
    public double convertFromCelsius(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }
}
