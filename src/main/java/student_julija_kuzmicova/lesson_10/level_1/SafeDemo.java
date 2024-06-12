package student_julija_kuzmicova.lesson_10.level_1;

//Task_4
class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe();
        System.out.println("PIN: " + safe.pin + "; Money: " + safe.money);
        safe.pin = 12345;
        safe.money = 6789;
        System.out.println("PIN: " + safe.pin + "; Money: " + safe.money);
    }
}
