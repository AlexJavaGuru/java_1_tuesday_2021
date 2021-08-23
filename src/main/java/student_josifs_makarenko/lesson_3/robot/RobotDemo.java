package student_josifs_makarenko.lesson_3.robot;

public class RobotDemo {
    public static void main(String[] args) {

        Robot R2D2 = new Robot("R2D2");
        Robot R1 = new Robot("R1");

        R1.sayHolo();
        R1.sayYourName();

        R2D2.sayHolo();
        R2D2.sayYourName();
    }

}
