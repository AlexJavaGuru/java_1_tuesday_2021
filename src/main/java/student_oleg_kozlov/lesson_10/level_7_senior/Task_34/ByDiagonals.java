package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

// Task_34
class ByDiagonals extends WinPosition {
    @Override
    public boolean isWin(char[][] field, char player) {
        return isWinCheckingTopToBottomUp(field, player) ||
                isWinCheckingTopToBottomDown(field, player) ||
                isWinCheckingBottomToTopUp(field, player) ||
                isWinCheckingBottomToTopDown(field, player);
    }

    private boolean isWinCheckingTopToBottomUp(char[][] field, char player) {
        int counter;
        for (int c = 0; c < field.length; c++) {
            int j = c;
            counter = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][j] == player) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 4) {
                    return true;
                }
                j++;
                if (j == field.length) {
                    break;
                }
            }
        }
        return false;
    }

    private boolean isWinCheckingTopToBottomDown(char[][] field, char player) {
        int counter;
        for (int c = 0; c < field.length; c++) {
            int i = c;
            counter = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == player) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 4) {
                    return true;
                }
                i++;
                if (i == field.length) {
                    break;
                }
            }
        }
        return false;
    }

    private boolean isWinCheckingBottomToTopUp(char[][] field, char player) {
        int counter;
        for (int c = 0; c < field.length; c++) {
            int i = field.length - 1 - c;
            counter = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == player) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 4) {
                    return true;
                }
                i--;
                if (i < 0) {
                    break;
                }
            }
        }
        return false;
    }

    private boolean isWinCheckingBottomToTopDown(char[][] field, char player) {
        int counter;
        for (int c = 0; c < field.length; c++) {
            int i = field.length - 1;
            counter = 0;
            for (int j = c; j < field.length; j++) {
                if (field[i][j] == player) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 4) {
                    return true;
                }
                i--;
                if (i < 0) {
                    break;
                }
            }
        }
        return false;
    }



}
