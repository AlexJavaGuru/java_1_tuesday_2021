package student_julija_kuzmicova.lesson_3.level_5;

//Task_18, Task_19, Task_20, Task_21, Task_22
class Dog {

    String name;
    byte age;
    String color;

    Dog(String name, byte age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println(name + " " + name + " " + name);
        System.out.println("My age is " + age);
        System.out.println("My color is " + color);
    }

    void happyBirthday() {
        age++;
    }

    void changeColor(String newColor) {
        color = newColor;
    }
}
