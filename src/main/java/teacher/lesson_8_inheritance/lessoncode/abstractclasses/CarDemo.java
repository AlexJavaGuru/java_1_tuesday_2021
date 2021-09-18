package teacher.lesson_8_inheritance.lessoncode.abstractclasses;

public class CarDemo {

    public static void main(String[] args) {
        //static POLYMORPHISM - method overloading

        //dynamic POLYMORPHISM - method overriding


        Car tesla = new ElectricCar("Tesla X", "Black", "Electricity", 100);
        Car bmw = new PetrolCar("BMW X5", "Blue", "Petrol", 100);
        Car toyota = new DiselCar("Toyota", "Blue", "Disel/Electric", 100, 100);

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

        Car[] cars = new Car[3];

        cars[2] = tesla;
        cars[1] = bmw;
        cars[0] = toyota;

        for (Car car : cars) {
            car.startEngine();
        }

    }
}
