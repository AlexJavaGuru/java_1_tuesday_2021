package student_sergej_pereligin.lesson_9.level_4;

public class Converter {
    TempConverter converter;

    public Converter (TempConverter converter){
        this.converter = converter;
    }


    public void convertCelsiusToFahrenheit(double celsius){
       double tempFah = converter.ConvertCtoF(celsius);
        System.out.println("Celsius was converted to Fahrenheit, temperature is " + tempFah);
    }

    public void convertCelsiusToKelvin(double celsius){
       double tempKel=  converter.convertCtoK(celsius);
        System.out.println("Celsius was converted to Kelvin, temperature is " + tempKel);
    }

}
