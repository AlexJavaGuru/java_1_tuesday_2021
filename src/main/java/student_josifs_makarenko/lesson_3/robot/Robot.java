package student_josifs_makarenko.lesson_3.robot;

 public class Robot {

     String name;

     Robot(String name) {
         this.name = name;
     }

    void sayYourName() {
        System.out.println("My name is " + name);
    }

    void sayHolo() {
         System.out.println(name + " said: Hello");
     }

}
