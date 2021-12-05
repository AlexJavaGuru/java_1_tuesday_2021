package student_oleg_kozlov.lesson_13.level_3;

// Task_20, Task_24
class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {
        System.out.println();
        System.out.println("==================================");
        System.out.println("o - live cell; '-' - dead cell");
        System.out.print("==================================");
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j]) {
                    System.out.print("o");
                } else {
                    System.out.print("-");
                }
            }
        }
        System.out.println();
    }

    public void showEndOfGameMessage() {
        System.out.println();
        System.out.println("==================================");
        System.out.println("No more live cells... End of game!");
        System.out.println("==================================");
    }
}
