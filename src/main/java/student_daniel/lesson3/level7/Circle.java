package student_daniel.lesson3.level7;

class Circle {
    //Task 30
    double radius;

    //Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    void getArea(){
        System.out.println(radius);
        System.out.println(calculateArea());
    }

}