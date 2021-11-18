package student_julija_kuzmicova.lesson_8.level_4;

//Task_18
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
}
