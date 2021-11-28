package student_sergej_pereligin.lesson_9.level_4;


public class ConverterDemo {
    public static void main(String[] args) {
        TempConverter newTempConverter = new TempConverterImpl();
        Converter converter = new Converter(newTempConverter);
        converter.convertCelsiusToFahrenheit(20);
        converter.convertCelsiusToKelvin(20);

    }



}
