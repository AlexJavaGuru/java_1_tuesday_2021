package student_daniel.lesson8;

public class CarDiesel extends CarEv {

    private int dieselTankCapacity;

    public CarDiesel(String model, String color, String fuelType, int dieselTankCapacity, int batteryCapacity) {
        super(model, color, fuelType, batteryCapacity);
        this.dieselTankCapacity = dieselTankCapacity;
    }

    public void engineStart() {
        if (dieselTankCapacity != 0 || batteryCapacity != 0) {
            engineState = true;
        }
    }
}
