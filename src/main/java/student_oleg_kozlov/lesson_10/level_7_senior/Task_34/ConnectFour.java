package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

import java.util.List;
import java.util.Scanner;

// Task_34
class ConnectFour {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.play();
    }

    public void play() {
        ConnectFourField field = new ConnectFourField();
        WinPosition[] winPositions = {
                new ByHorizontals(),
                new ByVerticals(),
                new ByDiagonals()
        };
        WinDetector winDetector = new WinDetector(winPositions);

        while (true) {
            System.out.println("* Player's 1 turn *");
            field.printField();
            field.completeMove(new ConnectFourMove(getNextMoveColumn(field.getColumnsAvailableForMove()), 'X'));
            field.printField();
            if (winDetector.isWinPosition(field.getField(), 'X')) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (field.noMoreMoves()) {
                System.out.println("DRAW!");
                break;
            }

            System.out.println("* Player's 2 turn *");
            field.printField();
            field.completeMove(new ConnectFourMove(getNextMoveColumn(field.getColumnsAvailableForMove()), 'O'));
            field.printField();
            if (winDetector.isWinPosition(field.getField(), 'O')) {
                System.out.println("Player 2 WIN!");
                break;
            }
            if (field.noMoreMoves()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public int getNextMoveColumn(List<Integer> availableColumns) {
        do {
            System.out.println("Available columns for move: " + availableColumns);
            System.out.print("Please provide your move column number: ");
            int x = scanner.nextInt();
            if (!availableColumns.contains(x)) {
                System.out.println("Wrong input, please try again!");
                continue;
            }
            return x;
        } while (true);
    }
}
