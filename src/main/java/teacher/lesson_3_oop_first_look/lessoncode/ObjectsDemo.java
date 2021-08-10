package teacher.lesson_3_oop_first_look.lessoncode;

public class ObjectsDemo {

    public static void main(String[] args) {
        //Ctrl + P - show required parameters
        MobilePhone samsung = new MobilePhone("S20", "Black", 100.0, "Android", 16);
        MobilePhone apple = new MobilePhone("X10", "White", 1000.0, "iOS", 16);

        System.out.println("Samsung:");
        System.out.println(samsung.model);
        System.out.println(samsung.RAM);

        System.out.println("Apple:");
        System.out.println(apple.model);
        System.out.println(apple.RAM);

        apple.makeACall(123456987);
        apple.sendMessage();
        apple.receiveACall();

        System.out.println("");

        samsung.makeACall(1111111);
        samsung.sendMessage();
        samsung.sendMessage();
        samsung.sendMessage();
        samsung.receiveACall();
    }

}
