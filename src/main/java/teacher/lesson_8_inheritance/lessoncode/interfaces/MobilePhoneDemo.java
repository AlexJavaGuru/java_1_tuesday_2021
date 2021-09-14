package teacher.lesson_8_inheritance.lessoncode.interfaces;

public class MobilePhoneDemo {

    public static void main(String[] args) {
        HighPayedPhone mob = new Apple();

        mob.makeCalls(12345L);
        mob.sendSMS("Hello, It's me...Mario!", 54321L);
        mob.transferData("My data");

        mob.makeCallFor1000(19135153L);

    }
}
