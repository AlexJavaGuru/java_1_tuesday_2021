package student_josifs_makarenko.lesson_3.level7;

public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;

    public double getPi() {
        return Pi;
    }

    public void setPi(double pi) {
        Pi = pi;
    }

    double Pi;

    void calculateArea(){
        double area;
        area = getPi() * 2 * getRadius();
        System.out.println("Area = " + area);
    }
}
