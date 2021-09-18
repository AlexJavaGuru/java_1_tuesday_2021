package student_julija_kuzmicova.lesson_3.level_7;

class Hamster {

    String name;
    int age;
    boolean isTired;
    boolean isHungry;

    Hamster (String name) {
        this.name = name;
        this.age = 0;
        this.isTired = false;
        this.isHungry = false;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
        isTired = false;
    }

    void run() {
        System.out.println(name + " is running");
        isTired = true;
    }

    void eat() {
        isHungry = false;
        System.out.println("I am not hungry more");
    }

    void happyBirthday() {
        age++;
        System.out.println("Belka is " + age + " year");
    }
}
