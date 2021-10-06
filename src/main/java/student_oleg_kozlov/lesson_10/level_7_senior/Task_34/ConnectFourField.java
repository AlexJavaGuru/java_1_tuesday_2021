package student_oleg_kozlov.lesson_10.level_7_senior.Task_34;

import java.util.ArrayList;
import java.util.List;

// Task_34
class ConnectFourField {
    private char[][] field;

    public char[][] getField() {
        return field;
    }

    public ConnectFourField() {
        this.field = createField();
    }

    public List<Integer> getColumnsAvailableForMove() {
        if (field == null || field.length == 0) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == ' ') {
                result.add(i + 1);
            }
        }
        return result;
    }

    public boolean noMoreMoves() {
        return getColumnsAvailableForMove().size() == 0;
    }

    public void completeMove(ConnectFourMove connectFourMove) {
        if (connectFourMove == null) {
            return;
        }
        if (!getColumnsAvailableForMove().contains(connectFourMove.getColumn())) {
            return;
        }
        int rowIndex = getRowIndexAvailableForMove(connectFourMove.getColumn());
        field[rowIndex][connectFourMove.getColumn() - 1] = connectFourMove.getPlayer();
    }

    public void printField() {
        if (field == null || field.length == 0) {
            return;
        }
        System.out.println();
        System.out.println("- - - - - - - -");
        System.out.println("1 2 3 4 5 6 7 8");
        System.out.println("- - - - - - - -");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("- - - - - - - -");
        System.out.println();
    }

    private char[][] createField() {
        char[][] result = new char[8][8];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = ' ';
            }
        }
        return result;
    }

    private int getRowIndexAvailableForMove(int column) {
        int index = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][column - 1] == ' ') {
                index = i;
            } else {
                break;
            }
        }
        return index;
    }
}
