package student_josifs_makarenko.lesson_8.level6;

public class Varags {
    public static void main(String[] args) {
        printSomething("My", "name", "Josifs");
    }

    static void printSomething(String...values) {
        for (String i : values) {
            System.out.println(i);
        }
    }
}