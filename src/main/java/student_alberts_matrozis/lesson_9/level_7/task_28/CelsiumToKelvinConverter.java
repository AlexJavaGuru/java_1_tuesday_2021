package student_alberts_matrozis.lesson_9.level_7.task_28;

public class CelsiumToKelvinConverter implements ConvertStrategy{

    @Override
    public double convert(double temperature) {
        double kelvin = temperature + 273.15;
        return Math.round(kelvin * 100.0) / 100.0;
    }
}
