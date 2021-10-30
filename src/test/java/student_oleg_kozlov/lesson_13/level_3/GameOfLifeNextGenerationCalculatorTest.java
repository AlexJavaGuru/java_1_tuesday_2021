package student_oleg_kozlov.lesson_13.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

// Task_11, Task_13, Task_15, Task_17
public class GameOfLifeNextGenerationCalculatorTest {

    private GameOfLifeNextGenerationCalculator nextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    @Test
    public void shouldRemoveLiveCellWhenLessThanTwoLiveNeighborsCornerCase() {
        int[] rowsForLive = {0, 1};
        int[] columnsForLive = {0, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertFalse(result[0][0]);
    }

    @Test
    public void shouldRemoveLiveCellWhenLessThanTwoLiveNeighborsSideCase() {
        int[] rowsForLive = {2, 3};
        int[] columnsForLive = {0, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertFalse(result[2][0]);
    }

    @Test
    public void shouldRemoveLiveCellWhenLessThanTwoLiveNeighborsCenterCase() {
        int[] rowsForLive = {5, 6};
        int[] columnsForLive = {5, 6};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertFalse(result[5][5]);
    }

    @Test
    public void shouldNotRemoveLiveCellWhenThreeLiveNeighborsCornerCase() {
        int[] rowsForLive = {0, 0, 1, 1};
        int[] columnsForLive = {0, 1, 0, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[0][0]);
    }

    @Test
    public void shouldRemoveLiveCellWhenMoreThanThreeLiveNeighborsSideCase() {
        int[] rowsForLive = {2, 1, 1, 2, 3};
        int[] columnsForLive = {0, 0, 1, 1, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertFalse(result[2][0]);
    }

    @Test
    public void shouldRemoveLiveCellWhenMoreThanThreeLiveNeighborsCenterCase() {
        int[] rowsForLive = {5, 4, 5, 5, 6};
        int[] columnsForLive = {5, 5, 4, 6, 6};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertFalse(result[5][5]);
    }

    @Test
    public void shouldNotRemoveLiveCellWhenTwoLiveNeighborsCornerCase() {
        int[] rowsForLive = {0, 0, 1};
        int[] columnsForLive = {0, 1, 0};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[0][0]);
    }

    @Test
    public void shouldNotRemoveLiveCellWhenTwoLiveNeighborsSideCase() {
        int[] rowsForLive = {2, 1, 1};
        int[] columnsForLive = {0, 0, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[2][0]);
    }

    @Test
    public void shouldNotRemoveLiveCellWhenThreeLiveNeighborsSideCase() {
        int[] rowsForLive = {2, 1, 1, 2};
        int[] columnsForLive = {0, 0, 1, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[2][0]);
    }

    @Test
    public void shouldNotRemoveLiveCellWhenTwoLiveNeighborsCenterCase() {
        int[] rowsForLive = {5, 4, 5};
        int[] columnsForLive = {5, 5, 4};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[5][5]);
    }

    @Test
    public void shouldNotRemoveLiveCellWhenThreeLiveNeighborsCenterCase() {
        int[] rowsForLive = {5, 4, 5, 5};
        int[] columnsForLive = {5, 5, 4, 6};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[5][5]);
    }

    @Test
    public void shouldMakeDeadCellLiveWhenThreeLiveNeighborsCornerCase() {
        int[] rowsForLive = {0, 1, 1};
        int[] columnsForLive = {1, 0, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[0][0]);
    }

    @Test
    public void shouldMakeDeadCellLiveWhenThreeLiveNeighborsSideCase() {
        int[] rowsForLive = {1, 1, 2};
        int[] columnsForLive = {0, 1, 1};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[2][0]);
    }

    @Test
    public void shouldMakeDeadCellLiveWhenThreeLiveNeighborsCenterCase() {
        int[] rowsForLive = {4, 5, 5};
        int[] columnsForLive = {5, 4, 6};
        boolean[][] result = nextGenerationCalculator.calculate(generateField(rowsForLive, columnsForLive));
        assertTrue(result[5][5]);
    }

    private boolean[][] generateField(int[] rowIndexes, int[] columnIndexes) {
        boolean[][] result = new boolean[10][10];
        if (rowIndexes == null || columnIndexes == null || rowIndexes.length != columnIndexes.length) {
            return result;
        }
        for (int i = 0; i < rowIndexes.length; i++) {
            result[rowIndexes[i]][columnIndexes[i]] = true;
        }
        return result;
    }
}