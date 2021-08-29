package student_sergej_pereligin.lesson_4.level_5;
/*Разработать программу,
которая работает в соответствии с требованиями, описанными ниже.

Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")

Логика с определением цвета должна быть реализована
в отдельном классе LightColorDetector:

class LightColorDetector {
​
  public String detect(int wavelength) {
    //TODO
  }

}*/
public class LightColorDetector {

        public String detect(int vaweLenght) {

            if (vaweLenght > 380 && vaweLenght < 449) {
                return "Violet";
            } else if (vaweLenght > 450 && vaweLenght < 494) {
                return "Blue";
            } else if (vaweLenght > 495 && vaweLenght < 569) {
                return "Green";
            } else if (vaweLenght > 570 && vaweLenght < 589) {
                return "Yellow";
            } else if (vaweLenght > 590 && vaweLenght < 619) {
                return "Orange";
            } else if (vaweLenght > 620 && vaweLenght < 750) {
                return "Red";
            } else {
                return "Invisible light";
            }
        }}

