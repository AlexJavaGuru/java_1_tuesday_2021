package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

// Task_34
class WinDetector {
    private WinPosition[] winPositions;

    public WinDetector(WinPosition[] winPositions) {
        this.winPositions = winPositions;
    }

    boolean isWinPosition(char[][] field, char player) {
        for (WinPosition position : winPositions) {
            if (position.isWin(field, player)) {
                return true;
            }
        }
        return false;
    }
}
