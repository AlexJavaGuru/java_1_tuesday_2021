package student_sergej_pereligin.lesson_4.level_7;

/*Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:

class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }

}

Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии. */
    public class FizzBuzz {public String detect(int number){
        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";
        }
        else if(isDividedBy3(number)) {
            return "Fizz";
        }
        else if(isDividedBy5(number)) {
            return "Buzz";
        }
        return "" + number;
    }

        private boolean isDividedBy3(int number) {
            return number % 3 == 0;
        }

        private boolean isDividedBy5(int number) {
            return number % 5 == 0;
        }
    }


