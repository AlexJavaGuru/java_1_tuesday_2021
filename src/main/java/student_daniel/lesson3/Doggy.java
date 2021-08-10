package student_daniel.lesson3;

public class Doggy {
    String name;
    int age;
    boolean isHungry;

    Doggy(String name) {
        this.name = name;
        this.age = 0;
        this.isHungry = false;
    }

    void sleep () {
        System.out.println("Sleeping");
    }

    void eat () {
        isHungry = false;
    }

    void birthDay () {
        age = age + 1;
    }


}
