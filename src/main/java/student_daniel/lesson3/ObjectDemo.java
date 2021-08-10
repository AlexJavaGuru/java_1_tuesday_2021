package student_daniel.lesson3;

public class ObjectDemo {
    public static void main(String[] args) {
        // Class var = new Class();
        // Ctrl + P to see missing args
        MobilePhone samsung = new MobilePhone("samsung", "s10", "black", 100.0, "Android", 32);
        MobilePhone apple = new MobilePhone("apple", "X", "white", 1000.0, "iOS", 256);

        samsung.makeCall(1231231232);
        samsung.sendMessage();
        samsung.sendMessage();
        samsung.sendMessage();
        samsung.receiveCall();

        apple.makeCall(123456789);
        apple.sendMessage();
        apple.sendMessage();
        apple.sendMessage();
        apple.receiveCall();

        //default value for String = Null
        //default value for double = 0.0
        //default value for int = 0

        System.out.println(samsung.brand);
        System.out.println(samsung.model);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        System.out.println(samsung.price);
        System.out.println(samsung.price);

    }
}
