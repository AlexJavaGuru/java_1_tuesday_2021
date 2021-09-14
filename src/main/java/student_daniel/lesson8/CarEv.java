package student_daniel.lesson8;

public class CarEv extends Car {

    protected int batteryCapacity;

    public CarEv(String model, String color, String fuelType, int battaryCapacity) {
        super(model, color, fuelType);
        this.batteryCapacity = battaryCapacity;
    }

    public void engineStart() {
        if (batteryCapacity !=0) {
            engineState = true;
        }
    }
}
