package student_alberts_matrozis.lesson_8.level_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtilDemo demoRunner = new ShapeUtilDemo();
        demoRunner.circleDemo();
        demoRunner.rectangleDemo();
        demoRunner.squareDemo();
        demoRunner.triangleDemo();
    }

    public void circleDemo() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle" +
                            "\nArea: " + circleArea +
                            "\nPerimeter: " + circlePerimeter);
    }

    public void squareDemo() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square" +
                "\nArea: " + squareArea +
                "\nPerimeter: " + squarePerimeter);
    }

    public void rectangleDemo() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle" +
                "\nArea: " + rectangleArea +
                "\nPerimeter: " + rectanglePerimeter);
    }

    public void triangleDemo() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle" +
                "\nArea: " + triangleArea +
                "\nPerimeter: " + trianglePerimeter);
    }
}
