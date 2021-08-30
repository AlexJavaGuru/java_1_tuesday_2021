package student_daniel.lesson3.level5;

class Dog {
    //Task 18, 19, 20, 21
    String name;
    String color;
    int age;


    //Constructor
    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        //Task 18
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        //Task 19
        System.out.println(name);
        System.out.println(age);

        //Task 21
        System.out.println(color);

    }

    //Task 20
    public int happyBirthday() {
        return age++;
    }

    //Task 22
    void changeColor(String newColor) {
        System.out.println(newColor);
        System.out.println(happyBirthday());
    }
}