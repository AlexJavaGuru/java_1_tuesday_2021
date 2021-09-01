package student_olga_urek.Lesson_3.level_3;

//Task 12, 13

class RobotDemoTwo {
    public static void main(String[] args) {

        RobotTwo myRobot = new RobotTwo("Robbie");
        System.out.println("Now the first robot spoke:");
        myRobot.sayHello();
        myRobot.sayYourName();

        RobotTwo robotTwo = new RobotTwo("Robert");
        System.out.println("Now the second robot spoke:");
        robotTwo.sayHello();
        robotTwo.sayYourName();

        RobotTwo robotThree = new RobotTwo("Bender");
        System.out.println("Now the third robot spoke:");
        robotThree.sayHello();
        robotThree.sayYourName();
    }
}

