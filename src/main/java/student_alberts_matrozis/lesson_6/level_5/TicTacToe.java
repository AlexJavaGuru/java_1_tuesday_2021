package student_alberts_matrozis.lesson_6.level_5;

class TicTacToe {
    public static void main(String[] args) {

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        } else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            return true;
        } else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFieldFull(int[][] field) {
        boolean isFieldFull = true;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    isFieldFull = false;
                    break;
                }
            }
        }
        return isFieldFull;
    }

    public boolean isDrawPosition(int[][] field) {
        if (isFieldFull(field)) {
            return !isWinPosition(field, 0) && !isWinPosition(field, 1);
        } else {
            return false;
        }}
}
