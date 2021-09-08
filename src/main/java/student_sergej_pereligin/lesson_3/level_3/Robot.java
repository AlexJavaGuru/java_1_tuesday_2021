package student_sergej_pereligin.lesson_3.level_3;

public class Robot {
  String name;
    Robot(String robotName) {
        this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
    }
    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
