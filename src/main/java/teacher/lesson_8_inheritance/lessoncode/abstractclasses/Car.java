package teacher.lesson_8_inheritance.lessoncode.abstractclasses;

public abstract class Car {

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

    abstract void accelerate();

    abstract void startEngine();

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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", speed=" + speed +
                ", engineOnOff=" + engineOnOff +
                '}';
    }
}
