package teacher.lesson_8_inheritance.lessoncode;

public class CarDemo {

    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar("Tesla X", "Black", "Electricity", 100);
        PetrolCar bmw = new PetrolCar("BMW X5", "Blue", "Petrol", 100);
        DiselCar toyota = new DiselCar("Toyota", "Blue", "Disel/Electric", 100, 100);

        toyota.startEngine();
        toyota.accelerate();

        tesla.startEngine();
        tesla.accelerate();
        tesla.accelerate();
        tesla.accelerate();

        bmw.startEngine();
        bmw.accelerate();
        bmw.accelerate();

        System.out.println(tesla.getSpeed());
        System.out.println(bmw.getSpeed());
    }
}
