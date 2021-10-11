package student_daniel.lesson8;

public class CarDemo {
    public static void main(String[] args) {
        CarEv myEvCar = new CarEv("Tesla", "White", "Electricity", 100);
        CarPatrol myPatrolCar = new CarPatrol("VW", "Black", "Patrol", 50);
        CarDiesel myDieselCar = new CarDiesel("Toyota", "Red", "Diesel/Electricity", 50, 100);

        myEvCar.accelerate();

        myPatrolCar.accelerate();
        myPatrolCar.accelerate();
        myPatrolCar.accelerate();

        myDieselCar.accelerate();
        myDieselCar.accelerate();

        System.out.println(myEvCar.getSpeed());
        System.out.println(myPatrolCar.getSpeed());
        System.out.println(myDieselCar.getSpeed());

    }
}
