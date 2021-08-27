package student_sergej_pereligin.lesson_4.level_4;

/*Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}*/
public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int devide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int substraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }




        public boolean isEven(int number) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }}

/*Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!

*/
