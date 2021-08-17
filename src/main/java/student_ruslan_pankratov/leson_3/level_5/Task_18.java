package student_ruslan_pankratov.leson_3.level_5;

public class Task_18 {
}

class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    void voice() {
        System.out.println("Кличка собаки: " + name);
        System.out.println("Кличка собаки: " + name);
        System.out.println("Кличка собаки: " + name);
    }
}

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Ber");
        dog.voice();


    }
}