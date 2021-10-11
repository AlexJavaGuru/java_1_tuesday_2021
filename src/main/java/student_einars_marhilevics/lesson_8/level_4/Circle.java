package student_einars_marhilevics.lesson_8.level_4;

import java.math.BigDecimal;

public class Circle extends Shape{
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
