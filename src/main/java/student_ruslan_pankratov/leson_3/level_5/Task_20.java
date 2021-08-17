package student_ruslan_pankratov.leson_3.level_5;

public class Task_20 {

}

class DogTwo {
    private final String name;
    private int age;
    public DogTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println("Кличка собаки: " + name);
        System.out.println("Возраст собаки: " + age);
    }

    void happyBirthday() {
        age++;
    }
}

class DogDemoTwo {
    public static void main(String[] args) {
        DogTwo dog = new DogTwo("Ber", 777);
        dog.voice();
        dog.happyBirthday();
        dog.voice();


    }
}