package student_alberts_matrozis.lesson_8.level_3.task_13;

public class HybridCar extends ElectricCar{

    private int dieselTankCapasity;
    private int maxDieselTankCapasity;

    public HybridCar(String model, String color, String engine, String fuelType, int batteryCapacity, int maxBatteryCapacity, int dieselTankCapasity, int maxDieselTankCapasity) {
        super(model, color, engine, fuelType, batteryCapacity, maxBatteryCapacity);
        this.dieselTankCapasity = dieselTankCapasity;
        this.maxDieselTankCapasity = maxDieselTankCapasity;
    }

    @Override
    void startEngine() {
        if (dieselTankCapasity != 0) {
            System.out.println("Hybrid car engine is started!");
        }
    }

    @Override
    void fillFuel() {
        if (maxDieselTankCapasity < dieselTankCapasity) {
            dieselTankCapasity = maxDieselTankCapasity;
        }
    }
}
