package student_olga_urek.Lesson_3.level_7;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
//Если задать тип возвращаемой переменной, то не получается внутри метода написать вывод результата на экран. Как это сделать?
    void calculateArea () {
        double circleArea = radius * radius * Math.PI;
        System.out.println("The area of the circle with the radius " + radius + " equals " + circleArea);
    }
}
