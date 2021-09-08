package student_julija_kuzmicova.lesson_3.level_5;

//Task_18, Task_19, Task_20, Task_21, Task_22
public class DogDemo {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex", (byte)0, "White");

        rex.voice();
        rex.happyBirthday();
        rex.voice();
        rex.changeColor("Black");
        rex.voice();
    }
}
