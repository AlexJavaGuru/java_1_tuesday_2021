package student_ruslan_pankratov.leson_3.level_5;

public class Task_19 {
}


class DogOne {
    private final String name;
    private int age;
    public DogOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println("Кличка собаки: " + name);
        System.out.println("Возраст собаки: " + age);
    }
}

class DogDemoOne {
    public static void main(String[] args) {
        DogOne dog = new DogOne("Ber", 777);
        dog.voice();


    }
}