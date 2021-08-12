package student_oleg_kozlov.lesson_3.level_5;

// Task_18, Task_19, Task_20, Task_21, Task_22
class DogDemo {

    public static void main(String[] args) {

        Dog barsik = new Dog("Barsik", (byte)0, "black");

        barsik.voice();
        barsik.happyBirthday();
        barsik.changeColor("white");
        System.out.println();
        barsik.voice();
    }
}
