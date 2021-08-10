package teacher.lesson_3_oop_first_look.lessoncode.dog;

import teacher.lesson_3_oop_first_look.lessoncode.MobilePhone;

public class DogDemo {

    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik");
        Dog bobik = new Dog("Bobik");
        Dog rex = new Dog("Rex");
        MobilePhone samsung = new MobilePhone("S20", "Black", 100.0, "Android", 16);

        sharik.sleep();
        rex.sleep();

        System.out.println(sharik.isHungry);
        System.out.println(rex.age);

        sharik.happyBirthday();
        sharik.happyBirthday();
        sharik.happyBirthday();
        System.out.println(sharik.age);
        System.out.println(rex.age);

        sharik = null;
    }
}
