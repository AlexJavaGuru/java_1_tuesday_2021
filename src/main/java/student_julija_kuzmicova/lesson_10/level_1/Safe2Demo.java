package student_julija_kuzmicova.lesson_10.level_1;

//Task_5
class Safe2Demo {

    public static void main(String[] args) {

        Safe2 safe2 = new Safe2(3333, 50);
        System.out.println("Money: " + safe2.getMoney());
        safe2.getMoney(111, 30);
        System.out.println("Failure! Money: " + safe2.getMoney());
        safe2.getMoney(3333, 30);
        System.out.println("Success! Money: " + safe2.getMoney());
        safe2.putMoney(111, 20);
        System.out.println("Failure! Money: " + safe2.getMoney());
        safe2.putMoney(3333, 20);
        System.out.println("Success! Money: " + safe2.getMoney());
    }
}
