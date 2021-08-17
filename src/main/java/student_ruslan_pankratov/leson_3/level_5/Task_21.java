package student_ruslan_pankratov.leson_3.level_5;

public class Task_21 {
}

class DogThree {
    private final String name;
    private int age;
    private String color;
    public DogThree(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Кличка собаки: " + name);
        System.out.println("Возраст собаки: " + age);
        System.out.println("Цвет собаки: " + color);
    }

}

class DogDemoThree{
    public static void main(String[] args) {
        DogThree dog = new DogThree("Ber", 777, "Black");
        dog.voice();
    }
}