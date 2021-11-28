package student_sergej_pereligin.lesson_8.level_5;

public class Rectangle extends Shape {

    private int width;
    private int height;

    Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width*2) + (height*2);
    }
}
