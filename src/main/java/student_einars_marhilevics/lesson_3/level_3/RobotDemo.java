package student_einars_marhilevics.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot robotOne = new Robot("Rider");
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robotTwo = new Robot("John");
        robotTwo.sayHello();
        robotTwo.sayYourName();
    }
}
