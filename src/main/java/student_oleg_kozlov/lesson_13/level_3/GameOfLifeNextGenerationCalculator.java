package student_oleg_kozlov.lesson_13.level_3;

// Task_10, Task_12, Task_14, Task_16, Task_18
class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] result = new boolean[currentGeneration.length][currentGeneration[0].length];
        int neighborsCount = 0;
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                result[i][j] = currentGeneration[i][j];
                neighborsCount = getLiveNeighborsNumber(currentGeneration, i, j);
                if (result[i][j]) {
                    if (neighborsCount < 2 || neighborsCount > 3) {
                        result[i][j] = false;
                    }
                } else {
                    if (neighborsCount == 3) {
                        result[i][j] = true;
                    }
                }
            }
        }
        return result;
    }

    private int getLiveNeighborsNumber(boolean[][] currentGeneration, int cellRow, int cellColumn) {
        return getLiveNeighborsNumberAbove(currentGeneration, cellRow, cellColumn) +
                getLiveNeighborsNumberBelow(currentGeneration, cellRow, cellColumn) +
                getLiveNeighborsNumberOnSides(currentGeneration, cellRow, cellColumn);
    }

    private int getLiveNeighborsNumberAbove(boolean[][] currentGeneration, int cellRow, int cellColumn) {
        if (cellRow == 0) {
            return 0;
        }
        int rowToCheck = cellRow - 1;
        return checkHorizontalForLiveNeighbors(currentGeneration, rowToCheck, cellColumn);
    }

    private int getLiveNeighborsNumberBelow(boolean[][] currentGeneration, int cellRow, int cellColumn) {
        if (cellRow == currentGeneration.length - 1) {
            return 0;
        }
        int rowToCheck = cellRow + 1;
        return checkHorizontalForLiveNeighbors(currentGeneration, rowToCheck, cellColumn);
    }

    private int checkHorizontalForLiveNeighbors(boolean[][] currentGeneration, int rowToCheck, int cellColumn) {
        int counter = 0;
        int j = 0;
        if (cellColumn != 0) {
            j = cellColumn - 1;
        }
        int stopAt = cellColumn + 1;
        if (stopAt >= currentGeneration.length) {
            stopAt = cellColumn;
        }
        for (int k = j; k < stopAt + 1; k++) {
            if (currentGeneration[rowToCheck][k]) {
                counter++;
            }
        }
        return counter;
    }

    private int getLiveNeighborsNumberOnSides(boolean[][] currentGeneration, int cellRow, int cellColumn) {
        int counter = 0;
        if (cellColumn > 0) {
            if (currentGeneration[cellRow][cellColumn - 1]) {
                counter++;
            }
        }
        if ((cellColumn + 1) < currentGeneration[cellRow].length) {
            if (currentGeneration[cellRow][cellColumn + 1]) {
                counter++;
            }
        }
        return counter;
    }

}
