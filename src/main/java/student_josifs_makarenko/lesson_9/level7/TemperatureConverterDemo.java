package student_josifs_makarenko.lesson_9.level7;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        TemperatureConverterContext temperatureConverterContext = new TemperatureConverterContext(new CelsiusConverter());
        System.out.println(temperatureConverterContext.executeContext(Temperature.FAHRENHEIT, 5.0));
        TemperatureConverterContext temperatureConverterContext1 = new TemperatureConverterContext(new FahrenheitConverter());
        System.out.println(temperatureConverterContext1.executeContext(Temperature.KELVIN, 1));

        TemperatureConverterContext temperatureConverterContext2 = new TemperatureConverterContext(new KelvinConverter());
        System.out.println(temperatureConverterContext2.executeContext(Temperature.FAHRENHEIT, 1));
    }
}
