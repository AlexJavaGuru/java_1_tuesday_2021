package student_daniel.lesson3;

public class MobilePhone {
    //konstruktor, peredaem znachenija
    MobilePhone(String brand, String model, String color, double price, String operationSystem, int randomAccessMemory) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.operationSystem = operationSystem;
        this.randomAccessMemory = randomAccessMemory;
    }


    //svojstva telefona - otlichitelnie cherti objecta
    String brand;
    String model;
    String color;
    double price;
    String operationSystem;
    int randomAccessMemory;


    //metodi povedenija - chto umeet object
    public void makeCall(long callingNumber) {
        System.out.println("I'm calling: " + callingNumber);
    }

    public void receiveCall() {
        System.out.println("I'm receiving a call");
    }

    public void sendMessage() {
        System.out.println("Sending out a message");
    }

}
