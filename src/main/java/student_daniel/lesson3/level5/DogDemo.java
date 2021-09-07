package student_daniel.lesson3.level5;

class DogDemo {
    // Task 18, 19, 20, 21, 22
    public static void main(String[] args) {
        Dog dogName = new Dog("Venimiamin", 19, "Black");

        dogName.voice();
        dogName.happyBirthday();
        dogName.changeColor("Green");
        dogName.changeColor("Orange");
        dogName.changeColor("Gold");
    }
}
