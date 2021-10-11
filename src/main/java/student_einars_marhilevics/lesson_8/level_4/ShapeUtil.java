package student_einars_marhilevics.lesson_8.level_4;

import java.util.Random;

public class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle",random.nextDouble(),random.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble());
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
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].calculateArea();
        }
        return result;
    }

    double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].calculatePerimeter();
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
