package student_oleg_kozlov.lesson_8.level_6;

// Task_30
class Varargs {
    public int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
