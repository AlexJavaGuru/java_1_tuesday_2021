package student_einars_marhilevics.lesson_6.level_5;

class TicTacToe {
    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck == field[i][0] && playerToCheck == field[i][1] && playerToCheck == field[i][2]) {
                win = true;
            } else {
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
            } else {
                win = false;
            }
        }
        return win;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean win = false;
        if (playerToCheck == field[0][0] && playerToCheck == field[1][1] && playerToCheck == field[2][2] || playerToCheck == field[0][2] && playerToCheck == field[1][1] && playerToCheck == field[2][0]) {
            win = true;
        } else {
            win = false;
        }
        return win;
    }
    boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean win = false;
        if (isWinPositionForHorizontals(field, playerToCheck)) {
            win = true;
        }
        else if (isWinPositionForVerticals(field, playerToCheck)) {
            win = true;
        }
        else if (isWinPositionForDiagonals(field, playerToCheck)) {
            win = true;
        }
        else {
            win = false;
        }
        return win;
    }
    boolean isDrawPosition(int[][] field) {
        boolean draw = true;
        if(isWinPosition(field, 0)) {
            draw = false;
        }
        else if (isWinPosition(field, 1)) {
            draw = false;
        }
        else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == -1) {
                        draw = false;
                    }
                }
            }
        }
        return draw;
    }
    int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
    /*public Move getNextMove() {

    }*/
}
