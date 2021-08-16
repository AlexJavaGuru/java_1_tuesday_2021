package student_josifs_makarenko.lesson_3.dog;

public class Dog {
   private String dogName;
    String dogColor;
    int dogAge;

    Dog(String dogColor, String dogName) {
        this.dogAge = 0;
        this.dogColor = dogColor;
        this.dogName = dogName;
    }
    void voice(){
        System.out.println("Dog's name is: " + dogName);
        System.out.println("Dog's age is: " + dogAge);
        System.out.println("Dog's color is: " + dogColor);
    }
    void happyBirthday(){
       dogAge = dogAge++;
    }
}
