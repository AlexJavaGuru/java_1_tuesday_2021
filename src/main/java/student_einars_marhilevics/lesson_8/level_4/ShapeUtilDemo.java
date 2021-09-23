package student_einars_marhilevics.lesson_8.level_4;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("circleArea is " + circleArea);
        System.out.println("circlePerimeter is " + circlePerimeter);

        ShapeUtil squareTest = new ShapeUtil();
        Shape square = squareTest.createRandomSquare();
        double squareArea = squareTest.calculateArea(square);
        double squarePerimeter = squareTest.calculatePerimeter(square);
        System.out.println("squareArea is " + squareArea);
        System.out.println("squarePerimeter is " + squarePerimeter);
    }
}
