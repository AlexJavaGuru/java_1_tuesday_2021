package teacher.lesson_7_encapsulation.lessoncode;

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", new Engine(10, "V"));
        Car car2 = car1;
        Car car3 = new Car("BMW", new Engine(10, "V"));

        if (car1.equals(car1)) { //true
            System.out.println("car1 = car1");
        }
        if (car1.equals(car2)) { //true
            System.out.println("car1 = car2");
        }
        if (car1.equals(car3)) { //?
            System.out.println("car1 = car3");
        }

        System.out.println(car1);

    }
}
