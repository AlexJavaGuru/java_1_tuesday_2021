package student_ruslan_pankratov.lesson_3.level_7;

import java.util.Scanner;


class Car {
    private int speed;
    private int stockPetrol;

    String s = "";

    void start(){
        stockPetrol = 100;
        cycle();
    }

    void cycle() {
        System.out.println("Если вы хотите продолжить поездку напишите yes, если вы хотите " +
                "прекратить напишите no");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        while (!s.equals("no")) {
            System.out.println("Сколько вы хотите проехать км?");
            int kilometer = scanner.nextInt();
            drive(kilometer);
        }
    }

    void drive(int kilometer) {
        int petrol = kilometer / 10;

        if (kilometer <= 1000) {

            if (stockPetrol >= petrol) {
                expenses(kilometer);
            } else {
                noGasoline();
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


    void expenses(int kilometer) {
        stockPetrol = stockPetrol - (kilometer / 10);
        int sum = stockPetrol * 10;
        System.out.println("Машина проехала: " + kilometer + " км");
        System.out.println("Осталось бензина " + stockPetrol);
        speed = 100;
        System.out.println("Может ещё проехать " + sum + " км");
        System.out.println("Машина ехала на скорости " + speed + " км");

    }

    void noGasoline() {
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

}
