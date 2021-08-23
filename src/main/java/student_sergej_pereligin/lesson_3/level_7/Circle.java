package student_sergej_pereligin.lesson_3.level_7;
/*Разработать класс - круг, у которого должны быть следующие характеристики:
    Свойства: радиус (double radius),
    Методы: расчет площади (double calculateArea()).

    Класс с объявлением фигуры круг должен называться "Circle".
    Класс с демонстрацией работы должен называться "CircleDemo".*/
public class Circle {
    double radius;
    Circle(int radius){this.radius=radius;}
    double calculateArea(){return (this.radius*this.radius*Math.PI);}


}
