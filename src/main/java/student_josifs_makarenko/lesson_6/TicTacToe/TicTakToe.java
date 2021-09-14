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

    boolean isWinForFirstSymbol(String[][] field) {
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (symbolOne.equals(field[i][j]) && symbolOne.equals(field[i + 1][j]) && symbolOne.equals(field[i + 2][j])) {
                    result = false;
                } else if (symbolOne.equals(field[i][j]) && symbolOne.equals(field[i][j + 1]) && symbolOne.equals(field[i][j + 2])) {
                    result = false;
                } else if (symbolOne.equals(field[i][j]) && symbolOne.equals(field[i + 1][j + 1]) && symbolOne.equals(field[i + 2][j + 2])) {
                    result = false;
                } else if (symbolOne.equals(field[i][j]) && symbolOne.equals(field[i - 1][j + 1]) && symbolOne.equals(field[i - 2][j + 2])) {
                    result = false;
                }
            }
        }
        return result;
    }

    boolean isWinForSecondSymbol(String[][] field) {
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (symbolTwo.equals(field[i][j]) && symbolTwo.equals(field[i][j + 1]) && symbolTwo.equals(field[i][j + 2])) {
                    result = false;
                } else if (symbolTwo.equals(field[i][j]) && symbolTwo.equals(field[i + 1][j]) && symbolTwo.equals(field[i + 2][j])) {
                    result = false;
                } else if (symbolTwo.equals(field[i][j]) && symbolTwo.equals(field[i + 1][j + 1]) && symbolTwo.equals(field[i + 2][j + 2])) {
                    result = false;
                } else if (symbolTwo.equals(field[i][j]) && symbolTwo.equals(field[i - 1][j + 1]) && symbolTwo.equals(field[i - 2][j + 2])) {
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
        System.out.println("Input X and Y for field ((5;5) is minimal)");
        String[][] field;
        field = createField(scanner.nextInt(), scanner.nextInt());

        System.out.println("Ok now we are ready!");
        while (true) {
            if (userOne.equals("Player")) {

                printFieldToConsole(field);
                humanMovieIfFirst(field);
                if (!isWinForFirstSymbol(field) || isDraw(field) || !isWinForSecondSymbol(field)) {
                    if (!isWinForFirstSymbol(field)) {
                        System.out.println(symbolOne + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    } else if (!isWinForSecondSymbol(field)) {
                        System.out.println(symbolTwo + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    }
                }

                robotMoveIfSecond(field);
                if (!isWinForFirstSymbol(field) || isDraw(field) || !isWinForSecondSymbol(field)) {
                    if (!isWinForFirstSymbol(field)) {
                        System.out.println(symbolOne + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    } else if (!isWinForSecondSymbol(field)) {
                        System.out.println(symbolTwo + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    }
                }

            } else if (userOne.equals("CPU")) {

                robotMoveIfFirst(field);
                if (!isWinForFirstSymbol(field) || isDraw(field) || !isWinForSecondSymbol(field)) {
                    if (!isWinForFirstSymbol(field)) {
                        System.out.println(symbolOne + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    } else if (!isWinForSecondSymbol(field)) {
                        System.out.println(symbolTwo + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    }
                }

                printFieldToConsole(field);
                humanMovieIfSecond(field);
                if (!isWinForFirstSymbol(field) || isDraw(field) || !isWinForSecondSymbol(field)) {
                    if (!isWinForFirstSymbol(field)) {
                        System.out.println(symbolOne + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    } else if (isDraw(field)) {
                        System.out.println("This is a DRAW, try again");
                        printFieldToConsole(field);
                        break;
                    } else if (!isWinForSecondSymbol(field)) {
                        System.out.println(symbolTwo + " is a WINNER");
                        printFieldToConsole(field);
                        break;
                    }
                }
            }

        }
    }

    void humanMovieIfFirst(String[][] field) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input X and Y for your turn");
        Move move = new Move(scanner.nextInt(), scanner.nextInt());
        if (!field[move.getY()][move.getX()].equals(symbolOne) && !field[move.getY()][move.getX()].equals(symbolTwo)) {
            field[move.getY()][move.getX()] = symbolOne;
        } else {
            System.out.println("eror");
            humanMovieIfFirst(field);
        }
    }

    void humanMovieIfSecond(String[][] field) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input X and Y for your turn");
        Move move = new Move(scanner.nextInt(), scanner.nextInt());
        if (!field[move.getY()][move.getX()].equals(symbolOne) && !field[move.getY()][move.getX()].equals(symbolTwo)) {
            field[move.getY()][move.getX()] = symbolTwo;
        } else {
            System.out.println("eror");
            humanMovieIfSecond(field);
        }
    }

    void robotMoveIfFirst(String[][] fakeField) {
        Random random = new Random();
        int i = random.nextInt(fakeField.length);
        int j = random.nextInt(fakeField[i].length);
            if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    !fakeField[i][j].equals(symbolOne) &&
                    !fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i][j].equals(symbolThree) &&
                    fakeField[1][1].equals(symbolThree)) {
                fakeField[1][1] = symbolOne;
            }  else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[1][1].equals(symbolOne) &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i + 1][j + 1].equals(symbolTwo) &&
                    fakeField[i + 2][j + 2].equals(symbolThree)) {
                fakeField[i + 2][j + 2] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[1][1].equals(symbolOne) &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i + 1][j + 1].equals(symbolTwo) &&
                    fakeField[i - 2][j - 2].equals(symbolThree)) {
                fakeField[i - 2][j - 2] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i - 1][j - 1].equals(symbolTwo) &&
                    fakeField[1][1].equals(symbolOne) &&
                    fakeField[i - 2][j - 2].equals(symbolThree)) {
                fakeField[i - 2][j - 2] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i - 1][j - 1].equals(symbolTwo) &&
                    fakeField[1][1].equals(symbolOne) &&
                    fakeField[i + 2][j + 2].equals(symbolThree)) {
                fakeField[i + 2][j + 2] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i][j - 1].equals(symbolTwo) &&
                    fakeField[1][1].equals(symbolOne)  &&
                    fakeField[i][j - 2].equals(symbolThree)) {
                fakeField[i][j - 2] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i][j - 1].equals(symbolTwo) &&
                    fakeField[1][1].equals(symbolOne)  &&
                    fakeField[i][j + 2].equals(symbolThree)) {
                fakeField[i][j + 2] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i - 1][j].equals(symbolTwo) &&
                    fakeField[i - 2][j].equals(symbolThree) &&
                    fakeField[1][1].equals(symbolOne)) {
                fakeField[i - 2][j] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[i][j].equals(symbolTwo) &&
                    fakeField[i - 1][j].equals(symbolTwo) &&
                    fakeField[i + 2][j].equals(symbolThree) &&
                    fakeField[1][1].equals(symbolOne)) {
                fakeField[i + 2][j] = symbolOne;
            } else if (!fakeField[i][j].equals("*") &&
                    !fakeField[i][j].equals("|") &&
                    !fakeField[i][j].equals("-") &&
                    fakeField[1][1].equals(symbolOne) &&
                    fakeField[i][j].equals(symbolThree)) {
                fakeField[i][j] = symbolOne;
            } else {
                robotMoveIfFirst(fakeField);
            }
    }

    void robotMoveIfSecond(String[][] fakeField) {
        Random random = new Random();
        int i = random.nextInt(fakeField.length);
        int j = random.nextInt(fakeField[i].length);
        if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i + 1][j + 1].equals(symbolOne) &&
                fakeField[i + 2][j + 2].equals(symbolThree)) {
            fakeField[i + 2][j + 2] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i + 1][j + 1].equals(symbolOne) &&
                fakeField[i - 2][j - 2].equals(symbolThree)) {
            fakeField[i - 2][j - 2] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i - 1][j - 1].equals(symbolOne) &&
                fakeField[1][1].equals(symbolOne) &&
                fakeField[i - 2][j - 2].equals(symbolThree)) {
            fakeField[i - 2][j - 2] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i - 1][j - 1].equals(symbolOne) &&
                fakeField[1][1].equals(symbolOne) &&
                fakeField[i + 2][j + 2].equals(symbolThree)) {
            fakeField[i + 2][j + 2] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i][j - 1].equals(symbolOne) &&
                fakeField[i][j - 2].equals(symbolThree)) {
            fakeField[i][j - 2] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i][j - 1].equals(symbolOne) &&
                fakeField[i][j + 2].equals(symbolThree)) {
            fakeField[i][j + 2] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i - 1][j].equals(symbolOne) &&
                fakeField[i - 2][j].equals(symbolThree)) {
            fakeField[i - 2][j] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolOne) &&
                fakeField[i - 1][j].equals(symbolOne) &&
                fakeField[i + 2][j].equals(symbolThree) &&
                fakeField[1][1].equals(symbolOne)) {
            fakeField[i + 2][j] = symbolTwo;
        } else if (!fakeField[i][j].equals("*") &&
                !fakeField[i][j].equals("|") &&
                !fakeField[i][j].equals("-") &&
                fakeField[i][j].equals(symbolThree)) {
            fakeField[i][j] = symbolTwo;
        } else {
            robotMoveIfSecond(fakeField);
        }
    }
}



