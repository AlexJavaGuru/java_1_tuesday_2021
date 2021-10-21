package student_julija_kuzmicova.lesson_8.level_4;

//Task_28
class ShapeUtilTest {

    private static ShapeUtil shapeUtil = new ShapeUtil();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        for(int i = 0; i < shapes.length; i++) {
            shapes[i] = shapeUtil.createRandomShape();
        }

        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTest(shapes);
        shapeUtilTest.calculatePerimeterTest(shapes);
    }

    void calculateAreaTest(Shape[] shapes) {
        checkResult(0, shapeUtil.calculateArea(shapes), "calculateAreaTest");
    }

    void calculatePerimeterTest(Shape[] shapes) {
        checkResult(0, shapeUtil.calculatePerimeter(shapes), "calculatePerimeterTest");
    }

    void checkResult(double expectedResult, double actualResult, String testName){
        if (expectedResult != actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
