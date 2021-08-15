package student_einars_marhilevics.lesson_3.level_5;


class Dog {
    String name;
    int age;
    String colour;
    Dog (String dogName, int age, String colour) {
        this.name = dogName;
        this.age = age;
        this.colour = colour;
    }
    public void voice () {
        System.out.println("My name is " + this.name);
        System.out.println("I am " + this.age + " years old");
        System.out.println("My colour is " + this.colour);}
    public void happyBirthday() {
        age ++;
        }
    public void changeColor(String newColor) {
        this.colour = newColor;
    }
}
