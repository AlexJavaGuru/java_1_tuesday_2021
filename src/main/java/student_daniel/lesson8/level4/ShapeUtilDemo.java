package student_daniel.lesson8.level4;

public class ShapeUtilDemo {
    //Task 20 21 22 23 24 25 26 27 28
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle Area = " + circleArea);
        System.out.println("Circle Perimeter = " + circlePerimeter);
    }
}