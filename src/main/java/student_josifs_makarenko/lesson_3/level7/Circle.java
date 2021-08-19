package student_josifs_makarenko.lesson_3.level7;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    void calculateArea(){
        double area;
        area = Math.PI * 2 * getRadius();
        System.out.println("Area = " + area);
    }
}
