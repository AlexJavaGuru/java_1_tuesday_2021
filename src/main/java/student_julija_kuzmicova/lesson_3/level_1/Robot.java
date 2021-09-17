package student_julija_kuzmicova.lesson_3.level_1;

//Task_2, Task_1, Task_5, Task_11, Task_12, Task_13
class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
