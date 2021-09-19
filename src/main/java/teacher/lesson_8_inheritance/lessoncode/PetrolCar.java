package teacher.lesson_8_inheritance.lessoncode;

public class PetrolCar extends Car {

    private int tankCapacity;

    public PetrolCar(String model, String color, String fuelType, int tankCapacity) {
        super(model, color, fuelType);
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void accelerate() {
        if (engineOnOff) {
            speed+=5;
        }
    }

    public void startEngine() {
        if (tankCapacity != 0) {
            engineOnOff = true;
        }
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
