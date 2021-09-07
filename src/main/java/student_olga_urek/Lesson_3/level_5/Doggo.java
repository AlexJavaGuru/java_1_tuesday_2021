// Task 18, 19, 20, 21, 22

package student_olga_urek.Lesson_3.level_5;

class Doggo {

    private String name;
    int age;
    String color;

    public Doggo(String name, int age, String color) {
        this.name = name;
        this.age =age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int age) {
        this.age = age;
    }

    public void voice () {
        System.out.println(name + " " + name + " " + name + "!");
    }

    public void voiceTwo() {
        System.out.println("My name is " + name + " and I am " + age + " years old! And I am " + color + "!");
    }
    public void happyBirthday () {
        age = age + 1;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

}