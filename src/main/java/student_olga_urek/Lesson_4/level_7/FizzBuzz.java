package student_olga_urek.Lesson_4.level_7;

class FizzBuzz {
    public String fizzify(int number) {
        if ((number%3 == 0) && (number%5 ==0)) {
            return "FizzBuzz";
        } else if (number%3 == 0) {
            return "Fizz";
        } else if (number%5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
