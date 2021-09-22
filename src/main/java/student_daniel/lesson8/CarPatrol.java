package student_daniel.lesson8;

public class CarPatrol extends Car {

    private int tankCapacity;

    public CarPatrol(String model, String color, String fuelType, int tankCapacity) {
        super(model, color, fuelType);
        this.tankCapacity = tankCapacity;
    }

    public void engineStart() {
        if (tankCapacity !=0) {
            engineState = true;
        }
    }
}
