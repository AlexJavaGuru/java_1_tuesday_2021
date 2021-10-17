package student_alberts_matrozis.lesson_8.level_3.task_13;

public abstract class Car {
    protected String model;
    protected String color;
    protected String engine;
    protected String fuelType;

    public Car(String model, String color, String engine, String fuelType) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.fuelType = fuelType;
    }

    abstract void startEngine();
    abstract void fillFuel();

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuelType() {
        return fuelType;
    }
}
