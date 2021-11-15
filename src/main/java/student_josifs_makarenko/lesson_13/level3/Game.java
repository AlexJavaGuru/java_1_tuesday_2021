package student_josifs_makarenko.lesson_13.level3;

import java.util.Random;

public class Game {

    public void play() {
        GameUI gameUI = new GameUI();
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();

        boolean[][] field = generator.generateField();

        while (true) {
            gameUI.show(field);
            makeAPause();

            if (isLive(field)) {
                System.out.println("THE END...Pres F for this guys");
                break;
            }

            field = calculator.calculate(field);
        }
    }

    boolean isLive(boolean[][] field) {
        for (boolean[] booleans : field) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    return false;
                }
            }
        }
        return true;
    }

    void makeAPause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {}
    }
}
