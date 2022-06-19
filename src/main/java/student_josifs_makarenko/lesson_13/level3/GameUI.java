package student_josifs_makarenko.lesson_13.level3;

public class GameUI {

    public void show(boolean[][] field) {
        System.out.println();
        System.out.println("-------------------");
        System.out.println("|: alive, *: died");
        System.out.println("-------------------");

        for (boolean[] booleans : field) {
            System.out.println();
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }
}
