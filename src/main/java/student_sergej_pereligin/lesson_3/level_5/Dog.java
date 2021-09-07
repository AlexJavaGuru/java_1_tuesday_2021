package student_sergej_pereligin.lesson_3.level_5;

public class Dog {
    String name;
    int age;
    String color;


    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color=color;
    }

    void voice() {
        System.out.println(this.name + " Gav "+this.age+ " years"+" and I'm "+ this.color);
        System.out.println(this.name + " Gav "+this.age+ " years"+" and I'm "+ this.color);
        System.out.println(this.name + " Gav "+this.age+ " years"+" and I'm "+ this.color);
    }
    void happyBirthday() {
        System.out.println("I am " +this.age+ " after year I will be "+ (this.age+1)+ " years old!");
    }

    String changeColor(String newColor) {
         return this.color=newColor;
    }


}
