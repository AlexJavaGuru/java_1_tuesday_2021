package student_olga_urek.Lesson_3.level_3;

//Task 11

class RobotTwo {

    String name;

    public RobotTwo(String robotName) {
        this.name = robotName;
    }


    public void sayHello () {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }
}
