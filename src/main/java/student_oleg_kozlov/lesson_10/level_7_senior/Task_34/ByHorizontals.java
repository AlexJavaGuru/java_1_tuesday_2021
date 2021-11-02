package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

// Task_34
class ByHorizontals extends WinPosition {
    @Override
    public boolean isWin(char[][] field, char player) {
        int counter;
        for (int i = 0; i < field.length; i++) {
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
            }
        }
        return false;
    }
}
