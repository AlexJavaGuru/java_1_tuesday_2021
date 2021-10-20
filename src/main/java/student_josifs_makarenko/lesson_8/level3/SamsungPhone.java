package student_josifs_makarenko.lesson_8.level3;

public class SamsungPhone extends Phone {

    String model;
    int batteryCharge;

    SamsungPhone(String firm, int price, int batteryCharge) {
        super(firm, price);
        this.batteryCharge = batteryCharge;
    }

    void onOff() {
        if (batteryCharge != 0) {
            System.out.println("Device activated...");
            deviceOnOff = true;
        }
    }
}
