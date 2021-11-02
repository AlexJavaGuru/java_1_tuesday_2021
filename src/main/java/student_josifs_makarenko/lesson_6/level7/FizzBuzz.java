package student_josifs_makarenko.lesson_6.level7;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.detect(9));
    }

    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }
}
