package student_oleg_kozlov.lesson_10.level_7_senior;

// Task_35
class MobilePhoneFields {
    private String model;
    private String color;
    private double price;
    private String operationSystem;
    private int ram;

    public MobilePhoneFields(String model, String color, double price, String operationSystem, int ram) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.operationSystem = operationSystem;
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "MobilePhoneFields{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", operationSystem='" + operationSystem + '\'' +
                ", ram=" + ram +
                '}';
    }
}
