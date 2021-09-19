package student_daniel.lesson4.level7;

class FizzBuzz {
    // Task 22
    public String detect(int number) {
        if ((number % 5 == 0) && (number % 3 == 0)) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "Number '" + number + "' cannot be divided on 3 or 5";
        }
    }
}
