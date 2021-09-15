package student_julija_kuzmicova.lesson_3.level_1;

import student_julija_kuzmicova.lesson_3.level_1.Robot;

//Task_3, Task_4, Task_5, Task_6, Task_12
public class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Max");
        robot3.sayHello();
        robot3.sayYourName();
    }
}
