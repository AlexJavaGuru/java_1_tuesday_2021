package student_oleg_kozlov.lesson_14.level_1;

// Task_8, Task_9
class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
