package student_sergej_pereligin.lesson_10.level_1;

public class SafeDemoV2 {
    public static void main(String[] args) {
        SafeV2 demoSafe = new SafeV2(222, 500);
        demoSafe.getMoney(222, 100);
        demoSafe.putMoney(222,500);

        demoSafe.pin = 333;

        demoSafe.getMoney(222, 500);
        demoSafe.getMoney(333, 500);

        demoSafe.amountOfStoredMoney = 300;

        System.out.println(demoSafe.amountOfStoredMoney);
    }
}
