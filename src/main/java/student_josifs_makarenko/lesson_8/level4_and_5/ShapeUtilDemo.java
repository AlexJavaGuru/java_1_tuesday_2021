package student_josifs_makarenko.lesson_8.level4_and_5;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape firstShape = shapeUtil.createRandomCircle();
        System.out.println(shapeUtil.calculatePerimeter(firstShape));

        Shape secondShape = shapeUtil.createRandomTriangle();
        System.out.println(shapeUtil.calculatePerimeter(secondShape));

        Shape thirdShape = shapeUtil.createRandomShape();
        System.out.println(shapeUtil.calculateArea(thirdShape));
        System.out.println(shapeUtil.calculatePerimeter(thirdShape));

        shapeUtil.addToArray(firstShape);
        shapeUtil.addToArray(secondShape);
        shapeUtil.addToArray(thirdShape);

        System.out.println(shapeUtil.calculatePerimeter(ShapeUtil.shapes));
    }
}
