package student_julija_kuzmicova.lesson_3.level_7;

import java.util.Scanner;

class SmartWatch {

    String model;
    String operationSystem;

    SmartWatch (String model, String operationSystem){
        this.model = model;
        this.operationSystem = operationSystem;
    }

    void setATime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time...");
        String time = scanner.next();
        System.out.println("It is " + time + " now");
    }

    void receiveACall() {
        System.out.println("Unknown number is calling you");
    }
}
