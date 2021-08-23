package student_ruslan_pankratov.leson_3.level_5;

// Task 18 - 22

class Dog {
    private final String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
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

    void happyBirthday() {
        age++;
    }
}


