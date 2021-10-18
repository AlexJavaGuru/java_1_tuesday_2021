package student_josifs_makarenko.lesson_6.TicTacToe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTakToe {

    String userOne;
    String userTwo;
    String symbolOne = "X";
    String symbolTwo = "O";
    String symbolThree = " ";
    String symbolToCheck;
    int xSize;
    int ySize;

    public String[][] createField(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        String[][] array = new String[ySize][xSize];
        for (String[] strings : array) {
            Arrays.fill(strings, symbolThree);
        }
        return array;
    }


    public void printFieldToConsole(String[][] field) {
        System.out.print("/");

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][0] = "|";
                field[0][j] = "-";
                field[i][ySize - 1] = "|";
                field[xSize - 1][j] = "-";
            }
        }

        field[0][0] = "*";
        field[xSize - 1][ySize - 1] = "*";

        for (int i = 0; i < field[0].length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j < 1) {
                    System.out.print(i);
                }
                System.out.print("\t" + field[i][j]);
            }
            System.out.println();
        }
    }

    boolean coinFlip() {
        Random random = new Random();
        int temp = random.nextInt(2);
        return temp == 0;
    }

    public void turnCheck() {
        if (coinFlip()) {
            userOne = "Player";
            userTwo = "CPU";
            System.out.println("Its heads, you are first");
        } else {
            userOne = "CPU";
            userTwo = "Player";
            System.out.println("Its tails, you are second");
        }
    }

    boolean isWin(String[][] field) {
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (symbolToCheck.equals(field[i][j]) && symbolToCheck.equals(field[i + 1][j]) && symbolToCheck.equals(field[i + 2][j])) {
                    result = false;
                } else if (symbolToCheck.equals(field[i][j]) && symbolToCheck.equals(field[i][j + 1]) && symbolToCheck.equals(field[i][j + 2])) {
                    result = false;
                } else if (symbolToCheck.equals(field[i][j]) && symbolToCheck.equals(field[i + 1][j + 1]) && symbolToCheck.equals(field[i + 2][j + 2])) {
                    result = false;
                } else if (symbolToCheck.equals(field[i][j]) && symbolToCheck.equals(field[i - 1][j + 1]) && symbolToCheck.equals(field[i - 2][j + 2])) {
                    result = false;
                }
            }
        }
        return result;
    }

    boolean isDraw(String[][] field) {
        boolean result = true;
        for (String[] strings : field) {
            for (String string : strings) {
                if (string.equals(symbolThree) && (!string.equals("|") && !string.equals("-") && !string.equals("*") && !string.equals("/"))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We need a field!");
        System.out.println("Input X and Y for field (like 5:5, 6:6...)");
        System.out.println("Field MUST be larger or equal 5:5!");
        String[][] field;
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        if (firstValue != secondValue || firstValue < 5) {
            System.out.println("If you cannot read I'll create field by myself!");
            firstValue = 5;
            secondValue = 5;
        }

        field = createField(firstValue, secondValue);

        System.out.println("Ok now we are ready!");
        while (true) {
            if (userOne.equals("Player")) {

                printFieldToConsole(field);
                humanMovie(field);
                if (!isWin(field) || isDraw(field)) {
                    if (!isWin(field)) {
                        System.out.println(symbolToCheck + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    }
                }

                robotMove(field);
                if (!isWin(field) || isDraw(field) || !isWin(field)) {
                    if (!isWin(field)) {
                        System.out.println(symbolToCheck + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    }
                }

            } else if (userOne.equals("CPU")) {

                robotMove(field);
                if (!isWin(field) || isDraw(field)) {
                    if (!isWin(field)) {
                        System.out.println(symbolToCheck + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    }
                }

                printFieldToConsole(field);
                humanMovie(field);
                if (!isWin(field) || isDraw(field)) {
                    if (!isWin(field)) {
                        System.out.println(symbolToCheck + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    }
                }
            }

        }
    }

    void humanMovie(String[][] field) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input X and Y for your turn");

        if (userOne.equals("Player")) {
            symbolToCheck = symbolOne;
        } else {
            symbolToCheck = symbolTwo;
        }

        Move move = new Move(scanner.nextInt(), scanner.nextInt());

        if (move.getY() > field.length - 2 || move.getX() > field.length - 2) {
            System.out.println("""
                    EROR
                    Your x or y is incorrect
                    input new""");
            humanMovie(field);
        } else {
            if (!field[move.getY()][move.getX()].equals(symbolToCheck)) {
                field[move.getY()][move.getX()] = symbolToCheck;
            } else {
                System.out.println("eror");
                humanMovie(field);
            }
        }
    }

    void robotMove(String[][] fakeField) {
        Random random = new Random();
        int i = random.nextInt(fakeField.length);
        int j = random.nextInt(fakeField[i].length);

        if (userOne.equals("CPU")) {
            symbolToCheck = symbolOne;
        } else {
            symbolToCheck = symbolTwo;
        }

        if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                !fakeField[i][j].equals(symbolOne) &&
                !fakeField[i][j].equals(symbolTwo) &&
                fakeField[i][j].equals(symbolThree) &&
                fakeField[1][1].equals(symbolThree)) {
            fakeField[1][1] = symbolOne;
        } else if (!fakeField[i][j].equals(symbolToCheck) &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("-") &&
                !fakeField[i][j].equals("/") &&
                !fakeField[i][j].equals("/") &&
                fakeField[i][j].equals(symbolThree)) {
            fakeField[i][j] = symbolToCheck;
        } else {
            robotMove(fakeField);
        }
    }
}



