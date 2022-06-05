package student_daniel.lesson8.level4;

abstract class Shape {
    //Task 15
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
