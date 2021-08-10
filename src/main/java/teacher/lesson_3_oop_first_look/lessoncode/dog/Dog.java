package teacher.lesson_3_oop_first_look.lessoncode.dog;

public class Dog {

    String name;
    int age;
    boolean isHungry;

    Dog(String name) {
        this.name = name;
        this.age = 0;
        this.isHungry = false;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void eat() {
        isHungry = false;
    }

    void happyBirthday() {
//        age++;
        age = age + 1;
    }
}
