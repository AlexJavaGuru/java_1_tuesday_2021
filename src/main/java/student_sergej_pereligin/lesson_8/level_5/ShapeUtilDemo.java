package student_sergej_pereligin.lesson_8.level_5;


public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        System.out.println("Circle area: " + circleArea);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle P: " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        System.out.println("Square area: " + squareArea);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square P: " + squarePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        System.out.println("Triangle area: " + triangleArea);
        double trianglePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Triangle P: " + trianglePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        System.out.println("Rectangle area: " + rectangleArea);
        double rectangleParameter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle P:" + rectangleParameter);

    }


}
