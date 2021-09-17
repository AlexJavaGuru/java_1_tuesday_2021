package teacher.lesson_8_inheritance.lessoncode.abstractclasses;

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

    @Override
    public void startEngine() {
        if (tankCapacity != 0) {
            engineOnOff = true;
            System.out.println("Petrol car engine started...");
        }
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
