package teacher.lesson_8_inheritance.lessoncode;

public class Car {

    protected String model;
    protected String color;
    protected String fuelType;
    protected int speed;
    protected boolean engineOnOff;

    public Car(String model, String color, String fuelType) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void accelerate() {
        speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEngineOnOff() {
        return engineOnOff;
    }

    public void setEngineOnOff(boolean engineOnOff) {
        this.engineOnOff = engineOnOff;
    }
}
