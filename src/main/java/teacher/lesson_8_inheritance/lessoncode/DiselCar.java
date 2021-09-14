package teacher.lesson_8_inheritance.lessoncode;

public class DiselCar extends ElectricCar {

    private int diselTankCapacity;

    public DiselCar(String model, String color, String fuelType, int batteryCapacity, int diselTankCapacity) {
        super(model, color, fuelType, batteryCapacity);
        this.diselTankCapacity = diselTankCapacity;
    }

    @Override
    public void accelerate() {
        if (engineOnOff) {
            speed+=30;
        }
    }

    public void startEngine() {
        if (diselTankCapacity != 0 || batteryCapacity != 0) {
            engineOnOff = true;
        }
    }

}
