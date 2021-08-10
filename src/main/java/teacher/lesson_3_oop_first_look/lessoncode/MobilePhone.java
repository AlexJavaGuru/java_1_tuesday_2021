package teacher.lesson_3_oop_first_look.lessoncode;

public class MobilePhone {

    String model;
    String color;
    double price;
    String operationSystem;
    int RAM;

    public MobilePhone(String model, String color, double price, String operationSystem, int RAM) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.operationSystem = operationSystem;
        this.RAM = RAM;
    }

    void makeACall(long callingNumber) {
        System.out.println("I'm making call on: " + callingNumber);
    }

    void receiveACall() {
        System.out.println("I'm receiving a call...");
    }

    void sendMessage() {
        System.out.println("Sending out a message...");
    }
}
