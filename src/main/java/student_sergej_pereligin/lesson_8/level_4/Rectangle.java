package student_sergej_pereligin.lesson_8.level_4;


public class Rectangle extends Shape {

    private int width;
    private int height;

    Rectangle(String title, int width, int height) {
        super(title);
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
