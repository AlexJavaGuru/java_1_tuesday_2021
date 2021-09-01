package student_josifs_makarenko.lesson_4.level7;

public class FizzBuzz {
    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return "" + number;
    }
}
