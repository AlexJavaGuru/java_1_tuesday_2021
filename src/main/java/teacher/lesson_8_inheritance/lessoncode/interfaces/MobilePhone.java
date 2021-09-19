package teacher.lesson_8_inheritance.lessoncode.interfaces;

public interface MobilePhone {

    void makeCalls(long number);

    void sendSMS(String text, long number);

    String receiveSMS();

    void onOff();

    void transferData(String data);

}
