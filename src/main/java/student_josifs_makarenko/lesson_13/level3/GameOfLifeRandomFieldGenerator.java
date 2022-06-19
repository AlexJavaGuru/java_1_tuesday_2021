package student_josifs_makarenko.lesson_13.level3;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {

    public boolean[][] generateField() {
        Random random = new Random();

        int row = random.nextInt(15) + 2;
        int column = random.nextInt(15) + 2;

        while (row != column) {
            row = random.nextInt(15);
        }

        boolean[][] result = new boolean[row][column];


        int tenthPart = row * column / 10;
        int countOfLivePersons;

        int randomValue = random.nextInt(5) + 1;

        if (randomValue == 1) {
            countOfLivePersons = tenthPart;
        } else if (randomValue == 2) {
            countOfLivePersons = tenthPart * 2;
        } else if (randomValue == 3) {
            countOfLivePersons = tenthPart * 3;
        } else if (randomValue == 4) {
            countOfLivePersons = tenthPart * 4;
        } else {
            countOfLivePersons = tenthPart * 5;
        }

        while (countOfLivePersons > 0) {
            int i = random.nextInt(row);
            int j = random.nextInt(column);

            if (!result[i][j]) {
                result[i][j] = true;
            }
            countOfLivePersons--;
        }
        return result;
    }
}
