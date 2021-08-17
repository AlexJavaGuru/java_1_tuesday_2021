package student_ruslan_pankratov.leson_3.level_6;

import java.util.Scanner;

public class Task_29_2 {
}

class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Прежде чем вы сможете заехать на заправку, вы должны расстратить " +
                "весь свой бензин, числа пишутся не меньше 10-ти");
        car.cycle();
    }
}

class Car {
    private int speed;
    private int stockPetrol = 100;

    String s = "";

    void cycle() {
        System.out.println("Если вы хотите продолжить поездку напишите yes, если вы хотите " +
                "прекратить напишите no");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        while (!s.equals("no")) {
            System.out.println("Сколько вы хотите проехать км?");
            int num1 = scanner.nextInt();
            drive(num1);
        }
    }

    void drive(int kilometer) {

        int kil = kilometer / 10;

        if (kilometer <= 1000) {

            if (stockPetrol >= kil) {
                stockPetrol = stockPetrol - (kilometer / 10);//наша машина будет потреблять 10 литров на 100 км
                int sum1 = stockPetrol * 10;
                System.out.println("Машина проехала: " + kilometer + " км");
                System.out.println("Осталось бензина " + stockPetrol);
                speed = 100;
                System.out.println("Может ещё проехать " + sum1 + " км");
                System.out.println("Машина ехала на скорости " + speed + " км");
            } else {
                speed = 0;
                System.out.println("Вы вунуждины остановится и заправится, иначе вам не хватит на проезд");
                System.out.println("Если вы хотите заправиться, напишите yes, если хотите прекратить поездку, " +
                        "напишите no");
                Scanner scanner = new Scanner(System.in);
                String scan = scanner.nextLine();
                String yes = "yes";
                if (scan.equals(yes)) {
                    refuel();
                } else {
                    s = "no";
                }
            }
        } else {
            System.out.println("Извините, но вам не хватит бензина на данную поезку, сделайте несколько " +
                    "коротких поездок, которые будут меньше 1000 км");
            cycle();
        }

    }

    void refuel() {
        stockPetrol = +100;
        System.out.println("Ваш бак заполнен на " + stockPetrol + " литров");
        cycle();
    }
}
