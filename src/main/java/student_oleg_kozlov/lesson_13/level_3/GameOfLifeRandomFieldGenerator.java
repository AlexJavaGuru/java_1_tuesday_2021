package student_oleg_kozlov.lesson_13.level_3;

import java.util.Random;

// Task_21, Task_23
class GameOfLifeRandomFieldGenerator {
    Random random = new Random();

    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] result = new boolean[fieldHeight][fieldWidth];

        int cellsTotal = fieldHeight * fieldWidth;
        int cellsLive = getLiveCellsNumber(cellsTotal);

        int i, j;
        while (cellsLive > 0) {
            i = random.nextInt(fieldHeight);
            j = random.nextInt(fieldWidth);
            if (!result[i][j]) {
                result[i][j] = true;
                cellsLive--;
            }
        }

        return result;
    }

    private int getLiveCellsNumber(int cellsTotal) {
        int tenthPartOfTotal = cellsTotal / 10;
        int multiplier = random.nextInt(5) + 1; // Range from 1 till 5
        return tenthPartOfTotal * multiplier;
    }
}
