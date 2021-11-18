package student_julija_kuzmicova.lesson_8.level_4;

//Task_27
class ShapeUtilDemo {

    ShapeUtil shapeUtil = new ShapeUtil();
    Shape circle = shapeUtil.createRandomCircle();
    double circleArea = shapeUtil.calculateArea(circle);
    double circlePerimeter = shapeUtil.calculatePerimeter(circle);

    Shape triangle = shapeUtil.createRandomTriangle();
    double triangleArea = shapeUtil.calculateArea(triangle);
    double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
}
