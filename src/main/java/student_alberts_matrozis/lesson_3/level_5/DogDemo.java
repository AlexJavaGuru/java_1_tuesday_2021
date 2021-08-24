package student_alberts_matrozis.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Charlie", 1, "Brown");
        dog.voice();
        dog.birthday();
        dog.changeColor("Black");
        dog.voice();
    }
}
