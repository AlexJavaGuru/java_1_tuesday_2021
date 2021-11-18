package student_julija_kuzmicova.lesson_8.level_4;

import java.util.Random;

//Task_20, Task_21, Task_22, Task_23, Task_24, Task_25, Task_26, Task_27
class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextInt(10));
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextInt(10));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextInt(10), random.nextInt(10));
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextInt(10));
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
        double area = 0;
        for(Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
