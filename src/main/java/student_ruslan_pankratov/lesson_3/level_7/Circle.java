package student_ruslan_pankratov.lesson_3.level_7;
//Task_30
class Circle {
    double radius;
    double calculateArea(double radius){
        double result = Math.PI * (radius * radius);
        return result;
    }
}

class CircleDemo{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 10;
        System.out.println( circle.calculateArea(circle.radius));//314.1592653589793
    }

}