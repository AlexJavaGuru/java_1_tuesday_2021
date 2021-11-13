package student_oleg_kozlov.lesson_10.level_7_senior;

// Task_35
class MobilePhone {
    private String model; // required
    private String color; // optional
    private double price; // optional
    private String operationSystem; // optional
    private int ram; // optional

    private MobilePhone(MobilePhoneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.price = builder.price;
        this.operationSystem = builder.operationSystem;
        this.ram = builder.ram;
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
        return "MobilePhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", operationSystem='" + operationSystem + '\'' +
                ", ram=" + ram +
                '}';
    }

    public static class MobilePhoneBuilder {
        private String model;
        private String color;
        private double price;
        private String operationSystem;
        private int ram;

        public MobilePhoneBuilder(String model) {
            this.model = model;
        }

        public MobilePhoneBuilder withColor(String color) {
            this.color = color;
            return this;
        }
        public MobilePhoneBuilder withPrice(double price) {
            this.price = price;
            return this;
        }
        public MobilePhoneBuilder withOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }
        public MobilePhoneBuilder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public MobilePhone build() {
            MobilePhone user = null;
            if (isValidMobilePhone()) {
                user = new MobilePhone(this);
            }
            return user;
        }
        private boolean isValidMobilePhone() {
            return !model.isBlank();
        }
    }
}
