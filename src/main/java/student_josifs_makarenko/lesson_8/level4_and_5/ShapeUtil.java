package student_josifs_makarenko.lesson_8.level4_and_5;

import java.util.Arrays;
import java.util.Random;

public class ShapeUtil {

    static Shape[] shapes;

    void addToArray(Shape shape) {
        Shape[] userData;
        if (shapes == null) {
            userData = new Shape[1];
            userData[0] = shape;
        } else {
            userData = new Shape[shapes.length + 1];
            System.arraycopy(shapes, 0, userData, 0, shapes.length);
            userData[shapes.length] = shape;
        }
        shapes = userData;
    }

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle(random.nextDouble() * 10);
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square(random.nextDouble() * 10);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle((random.nextDouble() * 10), (random.nextDouble() * 10));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle(random.nextDouble() * 10);
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

    double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            double perimeter = shape.calculatePerimeter();
            result = result + perimeter;
        }
        return result;
    }

    double calculateArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            double perimeter = shape.calculateArea();
            result = result + perimeter;
        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    void showShapes() {
        System.out.println(Arrays.toString(shapes));
    }
}
