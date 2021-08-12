package student_oleg_kozlov.lesson_3.level_5;

// Task_18, Task_19, Task_20, Task_21, Task_22
class Dog {

    private String nickname;
    private byte age;
    private String color;

    public Dog(String nickname, byte age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println(nickname + " " + nickname + " " + nickname);
        System.out.println("My age is " + age);
        System.out.println("My color is " + color);
    }

    public void happyBirthday() {
        age++;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }
}
