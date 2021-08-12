package student_einars_marhilevics.lesson_3.level_3;

public class Robot {
    String name;
    Robot(String robotName) {
        this.name = robotName;
    }
        public void sayHello() { System.out.println("Hello"); }
        public void sayYourName() { System.out.println("My name is " + this.name); }

}
