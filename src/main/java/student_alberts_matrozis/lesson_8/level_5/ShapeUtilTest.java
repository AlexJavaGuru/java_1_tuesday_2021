package student_alberts_matrozis.lesson_8.level_5;

import static student_alberts_matrozis.albertsUtils.Utils.check;

class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest testRunner = new ShapeUtilTest();
        testRunner.shapesAreaTest();
        testRunner.shapesPerimeterTest();
    }

    public void shapesAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double exceptedShapesArea = 0;
        for (Shape shape : shapes) {
            exceptedShapesArea += shape.calculateArea();
        }

        double receivedShapesArea = shapeUtil.calculateArea(shapes);
        check(exceptedShapesArea, receivedShapesArea);
    }

    public void shapesPerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double exceptedShapesPerimeter = 0;
        for (Shape shape : shapes) {
            exceptedShapesPerimeter += shape.calculatePerimeter();
        }

        double receivedShapesPerimeter = shapeUtil.calculatePerimeter(shapes);
        check(exceptedShapesPerimeter, receivedShapesPerimeter);
    }
}
