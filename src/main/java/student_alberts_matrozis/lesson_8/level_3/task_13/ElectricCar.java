package student_alberts_matrozis.lesson_8.level_3.task_13;

class ElectricCar extends Car {

    protected int batteryCapacity;
    protected int maxBatteryCapacity;

    public ElectricCar(String model, String color, String engine, String fuelType, int batteryCapacity, int maxBatteryCapacity) {
        super(model, color, engine, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.maxBatteryCapacity = maxBatteryCapacity;
    }

    @Override
    void startEngine() {
        if (batteryCapacity != 0) {
            System.out.println("Electric car engine is started!");
        }
    }

    @Override
    void fillFuel() {
        if (maxBatteryCapacity < batteryCapacity) {
            batteryCapacity = maxBatteryCapacity;
        }
    }
}
