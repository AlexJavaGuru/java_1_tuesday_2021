package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

// Task_34
class ConnectFourTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static final WinPosition[] winByHorizontals = {new ByHorizontals()};
    private static final WinPosition[] winByVerticals = {new ByVerticals()};
    private static final WinPosition[] winByDiagonals = {new ByDiagonals()};

    public static void main(String[] args) {
        winByHorizontalsTestPlayer1();
        winByHorizontalsTestPlayer2();
        noWinByHorizontalsTestPlayer1();
        noWinByHorizontalsTestPlayer2();

        winByVerticalsTestPlayer1();
        winByVerticalsTestPlayer2();
        noWinByVerticalsTestPlayer1();
        noWinByVerticalsTestPlayer2();

        winByDiagonalsTestPlayer1Case1();
        winByDiagonalsTestPlayer2Case1();
        winByDiagonalsTestPlayer1Case2();
        winByDiagonalsTestPlayer2Case2();
        noWinByDiagonalsTestPlayer1();
        noWinByDiagonalsTestPlayer2();

        printFooter();
    }

    private static void winByHorizontalsTestPlayer1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByHorizontals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', 'X', 'X', 'X', 'X', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'X'),"winByHorizontalsTestPlayer1");
    }

    private static void winByHorizontalsTestPlayer2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByHorizontals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', 'O', 'O', 'O'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'O'),"winByHorizontalsTestPlayer2");
    }

    private static void noWinByHorizontalsTestPlayer1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByHorizontals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'X', ' ', 'X', 'X', 'X', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(!winDetector.isWinPosition(field, 'X'),"noWinByHorizontalsTestPlayer1");
    }

    private static void noWinByHorizontalsTestPlayer2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByHorizontals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'O', 'X', 'O', 'O', 'O'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(!winDetector.isWinPosition(field, 'O'),"noWinByHorizontalsTestPlayer2");
    }

    private static void winByVerticalsTestPlayer1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByVerticals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'X'),"winByVerticalsTestPlayer1");
    }

    private static void winByVerticalsTestPlayer2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByVerticals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'O'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'O'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'O'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'O'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'O'),"winByVerticalsTestPlayer2");
    }

    private static void noWinByVerticalsTestPlayer1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByHorizontals);
        char[][] field = {{' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(!winDetector.isWinPosition(field, 'X'),"noWinByVerticalsTestPlayer1");
    }

    private static void noWinByVerticalsTestPlayer2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByHorizontals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'X', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '}};
        checkResult(!winDetector.isWinPosition(field, 'O'),"noWinByVerticalsTestPlayer2");
    }

    private static void winByDiagonalsTestPlayer1Case1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByDiagonals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'X', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', 'X', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', 'X', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'X'),"winByDiagonalsTestPlayer1Case1");
    }

    private static void winByDiagonalsTestPlayer2Case1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByDiagonals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'O', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', 'O', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'O', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'O'),"winByDiagonalsTestPlayer2Case1");
    }

    private static void winByDiagonalsTestPlayer1Case2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByDiagonals);
        char[][] field = {{' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                          {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'X'),"winByDiagonalsTestPlayer1Case2");
    }

    private static void winByDiagonalsTestPlayer2Case2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByDiagonals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', 'O', ' '},
                          {' ', ' ', ' ', ' ', ' ', 'O', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'O', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(winDetector.isWinPosition(field, 'O'),"winByDiagonalsTestPlayer2Case2");
    }

    private static void noWinByDiagonalsTestPlayer1() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByDiagonals);
        char[][] field = {{' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', 'X', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', 'X', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(!winDetector.isWinPosition(field, 'X'),"noWinByDiagonalsTestPlayer1");
    }

    private static void noWinByDiagonalsTestPlayer2() {
        totalRun++;
        WinDetector winDetector = new WinDetector(winByDiagonals);
        char[][] field = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', 'O', ' '},
                          {' ', ' ', ' ', ' ', ' ', 'O', ' ', ' '},
                          {' ', ' ', ' ', ' ', 'O', ' ', ' ', ' '},
                          {' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
                          {' ', ' ', 'O', ' ', ' ', ' ', ' ', ' '},
                          {' ', 'O', ' ', ' ', ' ', ' ', ' ', ' '},
                          {'O', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        checkResult(!winDetector.isWinPosition(field, 'O'),"noWinByDiagonalsTestPlayer2");
    }

    private static void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + !result);
            System.out.println("Actual:   " + result + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }
}
