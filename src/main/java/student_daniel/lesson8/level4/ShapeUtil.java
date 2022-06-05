package student_daniel.lesson8.level4;

import java.util.Random;

public class ShapeUtil {
    //Task 20 21 22 23 24 25 26 27 28
    Random myRandom = new Random();

    Circle createRandomCircle() {
        return new Circle(myRandom.nextDouble(), "Circle");
    }

    Square createRandomSquare() {
        return new Square(myRandom.nextDouble(), "Square");
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(myRandom.nextDouble(), myRandom.nextDouble(), "Rectangle");
    }

    Triangle createRandomTriangle() {
        return new Triangle(myRandom.nextDouble(), myRandom.nextDouble(), myRandom.nextDouble(), myRandom.nextDouble(), myRandom.nextDouble(), "Triangle");
    }

    Shape createRandomShape() {
        int randomNumber = myRandom.nextInt(4);
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
        double shapesArea = 0;
        for (Shape shape : shapes) {
            shapesArea += shape.calculateArea();
        }
        return shapesArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeter = 0;
        for (Shape shape : shapes) {
            shapesPerimeter += shape.calculatePerimeter();
        }
        return shapesPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
