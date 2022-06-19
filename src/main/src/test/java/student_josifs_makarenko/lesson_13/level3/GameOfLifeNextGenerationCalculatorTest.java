package student_josifs_makarenko.lesson_13.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeNextGenerationCalculatorTest {

    @Test
    void shouldDiedIfLess() {
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

        boolean[][] field = {{true, false, false}, {true, false, false}, {false, false, false}};
        boolean[][] expectedResult = {{false, false, false}, {false, false, false}, {false, false, false}};


        assertArrayEquals(expectedResult, gameOfLifeNextGenerationCalculator.calculate(field));
    }

    @Test
    void shouldDiedIfMore() {
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

        boolean[][] field = {{true, false, true},
                {true, true, true},
                {true, true, true}};
        boolean[][] expectedResult = {{true, false, true}, {false, false, false}, {true, false, true}};


        assertArrayEquals(expectedResult, gameOfLifeNextGenerationCalculator.calculate(field));
    }

    @Test
    void shouldLive() {
        GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

        boolean[][] field = {{true, false, true}, {true, false, false}, {false, false, false}};
        boolean[][] expectedResult = {{false, true, false}, {false, true, false}, {false, false, false}};

        assertArrayEquals(expectedResult, gameOfLifeNextGenerationCalculator.calculate(field));
    }
}