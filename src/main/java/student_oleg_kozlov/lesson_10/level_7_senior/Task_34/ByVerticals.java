package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

// Task_34
class ByVerticals extends WinPosition {
    @Override
    public boolean isWin(char[][] field, char player) {
        int counter;
        for (int j = 0; j < field.length; j++) {
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
            }
        }
        return false;
    }
}
