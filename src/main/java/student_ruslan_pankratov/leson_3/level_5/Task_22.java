package student_ruslan_pankratov.leson_3.level_5;

public class Task_22 {
}
class DogFour {
    private final String name;
    private int age;
    private String color;
    public DogFour(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Кличка собаки: " + name);
        System.out.println("Возраст собаки: " + age);
        System.out.println("Цвет собаки: " + color);
    }
    void changeColor(String newColor) {
      this.color = newColor;
    }

}

class DogDemoFour{
    public static void main(String[] args) {
        DogFour dog = new DogFour("Ber", 777, "Black");
        dog.voice();
        dog.changeColor("Brown");
        dog.voice();
    }
}