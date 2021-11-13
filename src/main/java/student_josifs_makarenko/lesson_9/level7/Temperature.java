package student_josifs_makarenko.lesson_9.level7;

public enum Temperature {
    CELSIUS (3),
    KELVIN (2),
    FAHRENHEIT (1);

    private final int temperatureCode;

    Temperature (int temperatureCode) {
        this.temperatureCode = temperatureCode;
    }

    public int getTemperatureCode() {
        return temperatureCode;
    }
}
