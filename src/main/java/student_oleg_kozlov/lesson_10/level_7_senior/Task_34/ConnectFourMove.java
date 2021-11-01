package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

// Task_34
class ConnectFourMove {
    private int column;
    private char player;

    public ConnectFourMove(int column, char player) {
        this.column = column;
        this.player = player;
    }

    public int getColumn() {
        return column;
    }

    public char getPlayer() {
        return player;
    }
}
