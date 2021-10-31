package student_josifs_makarenko.lesson_8.level3;

public class ApplePhone extends Phone {
    String model;
    int batteryCharge;

    ApplePhone(String firm, int price, int batteryCharge) {
        super(firm, price);
        this.batteryCharge = batteryCharge;
    }

    void onOff() {
        if (batteryCharge != 0) {
            System.out.println("Yor expensive Device activated...");
            deviceOnOff = true;
        }
    }
}
