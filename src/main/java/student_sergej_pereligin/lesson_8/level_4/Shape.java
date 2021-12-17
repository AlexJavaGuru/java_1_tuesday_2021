package student_sergej_pereligin.lesson_8.level_4;


public abstract class Shape {

   String titile;

     Shape(String title) {
     this.titile = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();


}
