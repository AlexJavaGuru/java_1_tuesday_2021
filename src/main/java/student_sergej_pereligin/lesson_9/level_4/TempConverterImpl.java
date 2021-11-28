package student_sergej_pereligin.lesson_9.level_4;


public class TempConverterImpl implements TempConverter {


    @Override
    public double ConvertCtoF(double celsius) {
        return (celsius * 9/5 + 32);

    }

    @Override
    public double convertCtoK(double celsius) {
        return (celsius+273.15);

    }
}
