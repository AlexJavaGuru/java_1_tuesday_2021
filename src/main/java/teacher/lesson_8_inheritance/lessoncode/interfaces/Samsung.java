package teacher.lesson_8_inheritance.lessoncode.interfaces;

public class Samsung implements MobilePhone {

    private boolean onOf;

    @Override
    public void makeCalls(long number) {
        System.out.println("Making call to number " + number);
    }

    @Override
    public void sendSMS(String text, long number) {
        System.out.println("Sending SMS with text  " + text + " to number " + number);
    }

    @Override
    public String receiveSMS() {
        return "Here is the text of your sms";
    }

    @Override
    public void onOff() {
        onOf = !onOf;
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transfer data with Bluetooth...");
    }
}
