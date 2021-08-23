package student_alberts_matrozis.lesson_3.level_5;
// Task 18 - 22
class Dog {

    private String nickname;
    private int age;
    private String color;

    public Dog(String nickname, int age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public void birthday() {
        age++;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void voice() {
        System.out.println(nickname + " " + nickname + " " + nickname);
        System.out.println("I am " + age + " years old!");
        System.out.println("I`m " + color + "!");
    }
}
