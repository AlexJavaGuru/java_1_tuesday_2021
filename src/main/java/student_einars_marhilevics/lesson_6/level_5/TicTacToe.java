package student_einars_marhilevics.lesson_6.level_5;

class TicTacToe {
    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck == field[i][0] && playerToCheck == field[i][1] && playerToCheck == field[i][2]) {
                win = true;
            }
            else {
                win = false;
            }
        }
        return win;
    }
    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck == field[0][i] && playerToCheck == field[1][i] && playerToCheck == field[2][i]) {
                win = true;
            }
            else {
                win = false;
            }
        }
        return win;
    }
}
