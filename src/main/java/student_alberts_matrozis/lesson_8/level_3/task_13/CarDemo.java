package student_alberts_matrozis.lesson_8.level_3.task_13;

class CarDemo {

    public static void main(String[] args) {
        Car toyota = new HybridCar("Toyota Camry Hybride", "Red", "V4", "Diesel/Electricity", 100, 200, 100, 500);
        Car tesla = new ElectricCar("Tesla Model S", "Black", "Electro", "Electricity", 100, 150);
        Car mercedes = new PetrolCar("Mercedes G63 AMG", "Black", "V8", "Petrol", 300, 500);

        toyota.fillFuel();
        toyota.startEngine();

        tesla.fillFuel();
        tesla.startEngine();

        mercedes.fillFuel();
        mercedes.startEngine();
    }

}
