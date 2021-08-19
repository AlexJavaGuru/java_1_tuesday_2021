package student_josifs_makarenko.lesson_3.dog;

public class Dog {
   private String name;
    String color;
    int age;

    Dog(String color, String name) {
        this.age = 0;
        this.color = color;
        this.name = name;
    }
    void voice(){
        System.out.println("Dog's name is: " + name);
        System.out.println("Dog's age is: " + age);
        System.out.println("Dog's color is: " + color);
    }
    void happyBirthday(){
       age = age++;
    }
}
