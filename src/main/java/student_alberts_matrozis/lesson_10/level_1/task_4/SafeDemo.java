package student_alberts_matrozis.lesson_10.level_1.task_4;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1337, 5000000);
        System.out.println("Pincode = " + safe.pinCode + " | " + "Money = " + safe.moneyAmount);
    }
}
