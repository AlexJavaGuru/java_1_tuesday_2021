package student_oleg_kozlov.lesson_8.level_4;

// Task_15
abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
