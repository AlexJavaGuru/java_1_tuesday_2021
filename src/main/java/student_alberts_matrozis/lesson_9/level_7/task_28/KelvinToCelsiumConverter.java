package student_alberts_matrozis.lesson_9.level_7.task_28;

public class KelvinToCelsiumConverter implements ConvertStrategy{

    @Override
    public double convert(double temperature) {
        double celsium = (temperature - 273.15);
        return Math.round(celsium * 100.0) / 100.0;
    }
}
