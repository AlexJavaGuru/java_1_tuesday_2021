package teacher.lesson_8_inheritance.lessoncode.abstractclasses;

public class ElectricCar extends Car {

    protected int batteryCapacity;

    public ElectricCar(String model, String color, String fuelType, int batteryCapacity) {
        super(model, color, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

   @Override
    public void accelerate() {
        if (engineOnOff) {
            speed+=10;
        }
    }

    @Override
    public void startEngine() {
        if (batteryCapacity != 0) {
            engineOnOff = true;
            System.out.println("Electric car engine started...");
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
