// Task 18, 19, 20, 21, 22

package student_olga_urek.Lesson_3.level_5;

class Doggo {

    private String name;
    int age;
    String color;

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

    public Doggo(String doggoName, int doggoAge, String doggoColor) {
        this.name = doggoName;
        this.age =doggoAge;
        this.color = doggoColor;
    }
//поправила форматирование, убрала this
    public void voice () {
        System.out.println(name + " " + name + " " + name + "!");
    }
    public void voiceTwo() {
        System.out.println("My name is " + name + " and I am " + age + " years old! And I am " + color + "!");
    }
    public int happyBirthday () {
        age = age + 1;
        return age;
    }
    public void changeColor(String newColor) {
        color = newColor;
    }

}