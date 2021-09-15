package teacher.lesson_8_inheritance.lessoncode.interfaces;

public class Apple implements MobilePhone, HighPayedPhone {

    private boolean onOf;

    @Override
    public void makeCalls(long number) {
        System.out.println("Making call to number " + number + " but for 1000$");
    }

    @Override
    public void sendSMS(String text, long number) {
        System.out.println("Sending SMS with text  " + text + " to number " + number + "but for 1000$");
    }

    @Override
    public String receiveSMS() {
        return "Here is the text of your sms" + "but for 1000$";
    }

    @Override
    public void onOff() {
        onOf = !onOf;
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transfer data with Air Drop..." + " but for 1000$");
    }

    @Override
    public void makeCallFor1000(long number) {
        System.out.println("I'm rich!");
    }
}
