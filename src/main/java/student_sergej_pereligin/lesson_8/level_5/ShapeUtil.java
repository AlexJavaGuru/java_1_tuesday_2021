package student_sergej_pereligin.lesson_8.level_5;



import java.util.Random;


public class ShapeUtil {
    Random random = new Random();

    Circle createRandomCircle(){
        int radius = random.nextInt(10);
        return new Circle(radius);
    }

    Square createRandomSquare(){
        int side = random.nextInt(10);
        return new Square(side);
    }

    Triangle createRandomTriangle(){
        int side = random.nextInt(10);
        return new Triangle(side);
    }

    Rectangle createRandomRectangle(){
        int width = random.nextInt(10);
        int height = random.nextInt(10);
        return new Rectangle(width, height);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result = result + shape.calculateArea();
        }
        return result;
    }

    double calculatePerimeter(Shape[] shapes){
        double result = 0;
        for (Shape shape : shapes) {
            result = result + shape.calculatePerimeter();
        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
