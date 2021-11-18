package student_julija_kuzmicova.lesson_8.level_6;

//Task_30
class Varargs {

    public static void main(String[] args) {
        sum(5, 3, 7, 2);
    }

    static void sum(int... numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        int length = numbers.length;
        System.out.print("Number of elements to add: " + length + ", Sum: " + sum);
    }
}
