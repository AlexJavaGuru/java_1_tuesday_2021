package student_einars_marhilevics.lesson_3.level_7;

class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car ("BMW", "diesel", 2010);
        Car hisCar = new Car ("Audi", "petrol", 2015);
        myCar.turnOn();
        hisCar.drive();
    }
}
