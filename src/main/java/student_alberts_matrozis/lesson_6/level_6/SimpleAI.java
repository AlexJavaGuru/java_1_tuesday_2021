package student_alberts_matrozis.lesson_6.level_6;

class SimpleAI {
    public int[][] AIplay(int[][] field) {
        TicTacToe ticTacToe = new TicTacToe();
        while (true) {
            int randX0 = (int) (Math.random() * 3);
            int randY0 = (int) (Math.random() * 3);

            if (field[randX0][randY0] == -1) {
             field[randX0][randY0] = 0;
            }

            if (ticTacToe.isWinPosition(field, 0)) {
                return field;
            }

            if (ticTacToe.isDrawPosition(field)) {
                return field;
            }


            int randX1 = (int) (Math.random() * 3);
            int randY1 = (int) (Math.random() * 3);

            if (field[randX1][randY1] == -1) {
                field[randX1][randY1] = 1;
            }

            if (ticTacToe.isWinPosition(field, 1)) {
                return field;
            }

            if (ticTacToe.isDrawPosition(field)) {
                return field;
            }
        }
    }
}
