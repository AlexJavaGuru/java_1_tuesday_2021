package student_daniel.lesson8.level3;

abstract class Figure{
    //Task 13
    double x;
    double y;

    Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    abstract double getPerimeter();

    abstract double getArea();
}
