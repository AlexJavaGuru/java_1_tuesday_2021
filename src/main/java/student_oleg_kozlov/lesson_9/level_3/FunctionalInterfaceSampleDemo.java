package student_oleg_kozlov.lesson_9.level_3;

// Task_6
class FunctionalInterfaceSampleDemo {
    public static void main(String[] args) {
        FunctionalInterfaceSample sample = () -> System.out.println("Method 'displayMessage' is called!");
        sample.displayMessage();
    }
}
