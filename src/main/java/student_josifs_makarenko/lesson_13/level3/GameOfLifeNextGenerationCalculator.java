package student_josifs_makarenko.lesson_13.level3;

public class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] result = new boolean[currentGeneration.length][currentGeneration[0].length];
        int neighbors;

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                result[i][j] = currentGeneration[i][j];
                neighbors = getLiveNeighbors(currentGeneration, i, j);
                if (neighbors < 2 || neighbors > 3) {
                    result[i][j] = false;
                } else if (neighbors == 3) {
                    result[i][j] = true;
                }
            }
        }
        return result;
    }

    public int getLiveNeighbors(boolean[][] currentGeneration, int row, int column) {

        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;

        int start = 0;
        if (column != 0) {
            start = column - 1;
        }

        int end = column + 1;
        if (end >= currentGeneration.length) {
            end = column;
        }

        for (int i = start; i <= end; i++) {

            if (row - 1 >= 0) {
                if (currentGeneration[row - 1][i]) {
                    firstValue++;
                }
            } else {
                firstValue = 0;
            }

            if (row + 1 < currentGeneration[column].length) {
                if (currentGeneration[row + 1][i]) {
                    secondValue++;
                }
            } else {
                secondValue = 0;
            }

            if (currentGeneration[row][i]) {
                thirdValue++;
            }
        }


        int result = firstValue + secondValue + thirdValue;

        if (currentGeneration[row][column]) {
            result--;
        }

        return result;
    }
}
