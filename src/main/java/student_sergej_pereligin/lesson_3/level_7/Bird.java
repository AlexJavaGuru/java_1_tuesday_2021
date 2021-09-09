package student_sergej_pereligin.lesson_3.level_7;

public class Bird {
    String color;
    int age;
    Bird(String color, int age){
        this.color=color;
        this.age=age;
    }
    void Voice(){
        System.out.println("Chirik I am "+ this.color +" bird");
    }
}
