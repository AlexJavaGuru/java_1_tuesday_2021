package student_alberts_matrozis.lesson_8.level_5;

import java.util.Random;

class ShapeUtil {

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

    Circle createRandomCircle() {
        int randomRadius = (int)(Math.random() * 50 + 1);

        return new Circle("Circle", randomRadius);
    }

    Square createRandomSquare() {
        int randomSide = (int)(Math.random() * 50 + 1);

        return new Square("Square", randomSide);
    }

    Rectangle createRandomRectangle() {
        int randomLength = (int)(Math.random() * 50 + 1);
        int randomWidth = (int)(Math.random() * 50 + 1);

        return new Rectangle("Rectangle", randomLength, randomWidth);
    }

    Triangle createRandomTriangle() {
        int randomSide = (int)(Math.random() * 50 + 1);

        return new Triangle("Triangle", randomSide);
    }

    double calculateArea(Shape[] shapes) {
        double shapesArea = 0;
        for (Shape shape : shapes) {
            shapesArea += shape.calculateArea();
        }
        return shapesArea;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeter = 0;
        for (Shape shape : shapes) {
            shapesPerimeter += shape.calculatePerimeter();
        }
        return shapesPerimeter;
    }

}
