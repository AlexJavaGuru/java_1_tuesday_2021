package student_alberts_matrozis.lesson_8.level_3.task_13;

class PetrolCar extends Car{

    private int tankCapacity;
    private int maxTankCapacity;

    public PetrolCar(String model, String color, String engine, String fuelType, int tankCapacity, int maxTankCapacity) {
        super(model, color, engine, fuelType);
        this.tankCapacity = tankCapacity;
        this.maxTankCapacity = maxTankCapacity;
    }

    @Override
    void startEngine() {
        if (tankCapacity != 0) {
            System.out.println("Petrol car engine started!");
        }
    }

    @Override
    void fillFuel() {
        if (tankCapacity < maxTankCapacity) {
            tankCapacity = maxTankCapacity;
        }
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
