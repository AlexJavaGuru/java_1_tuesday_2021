package student_oleg_kozlov.lesson_6.level_7;

// Task_32
class FizzBuzz {
//    private int initialNumber;

    public String detect(int number) {
//        this.initialNumber = number;
//        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
//        else if (initialNumber % 3 == 0) return "Fizz";
//        else if (initialNumber % 5 == 0) return "Buzz";
//        else return "" + initialNumber;

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number; // Return number as a string
        }
    }
}
