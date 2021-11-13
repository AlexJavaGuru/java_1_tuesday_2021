package student_josifs_makarenko.lesson10.level7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game implements GameInterface {

    String firstSymbol = "0";
    String secondSymbol = "1";
    String thirdSymbol = " ";
    String symbolToChek;
    String userOne;
    String userTwo;

    Scanner scanner = new Scanner(System.in);

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


    public String[][] createField(int value) {

        System.out.println("Choose a field: 1 - (7:6), 2 - (8:7), 3 - (10:7)");

        if (value == 1) {
            String[][] field1 = new String[9][10];
            for (String[] strings : field1) {
                Arrays.fill(strings, thirdSymbol);
            }

            int temp = 0;
            while (field1[0][temp].equals(thirdSymbol)) {
                field1[0][temp] = "*";
                field1[temp][9] = "*";
                field1[8][temp] = "*";
                field1[temp][0] = "*";
                if (temp < field1[0].length - 1) {
                    temp++;
                } else {
                    break;
                }
            }
            return field1;
        } else if (value == 2) {
            String[][] field2 = new String[10][11];
            for (String[] strings : field2) {
                Arrays.fill(strings, thirdSymbol);
            }

            int temp = 0;
            while (field2[0][temp].equals(thirdSymbol)) {
                field2[0][temp] = "*";
                field2[temp][10] = "*";
                field2[9][temp] = "*";
                field2[temp][0] = "*";
                if (temp < field2[0].length - 1) {
                    temp++;
                } else {
                    break;
                }
            }
            return field2;
        } else if (value == 3) {
            String[][] field3 = new String[10][13];
            for (String[] strings : field3) {
                Arrays.fill(strings, thirdSymbol);
            }
            int temp = 0;
            while (field3[0][temp].equals(thirdSymbol)) {
                field3[0][temp] = "*";
                field3[temp][12] = "*";
                field3[9][temp] = "*";
                field3[temp][0] = "*";
                if (temp < field3[0].length - 1) {
                    temp++;
                } else {
                    break;
                }
            }
            return field3;
        } else {
            System.out.println("How u get that?");
            return null;
        }
    }


    public void showField(String[][] field) {
        System.out.println(Arrays.deepToString(field).replace("], ", "\t|\n")
                .replace("[[", "|")
                .replace("]]", "\t|")
                .replace(",", "\t|")
                .replace("[", "|"));
    }

    @Override
    public void play() {
        System.out.println("*coin toss*" + "\n" + "*COIN TOSS SOUND EFFECT");
        coinFlip();
        turnCheck();

        System.out.println("Choose a field: 1 - (7:6), 2 - (8:7), 3 - (10:7)");
        int value = scanner.nextInt();

        if (value != 1 && value != 2 && value != 3) {
            while (value != 1 && value != 2 && value != 3) {
                System.out.println("try again");
                value = scanner.nextInt();
            }
        }

        String[][] field = createField(value);

        while (true) {
            if (userOne.equals("Player")) {
                showField(field);
                humanMovie(field);
                if (isWin(field) || isDraw(field)) {
                    if (isWin(field)) {
                        showField(field);
                        System.out.println(symbolToChek + " is a Winner");
                        break;
                    } else if (isDraw(field)) {
                        showField(field);
                        System.out.println(" Its a draw");
                        break;
                    }
                }

                cpuMovie(field);
                if (isWin(field) || isDraw(field)) {
                    if (isWin(field)) {
                        showField(field);
                        System.out.println(symbolToChek + " is a Winner");
                        break;
                    } else if (isDraw(field)) {
                        showField(field);
                        System.out.println(" Its a draw");
                        break;
                    }
                }
            } else if (userOne.equals("CPU")) {
                cpuMovie(field);
                if (isWin(field) || isDraw(field)) {
                    if (isWin(field)) {
                        showField(field);
                        System.out.println(symbolToChek + "is a Winner");
                        break;
                    } else if (isDraw(field)) {
                        showField(field);
                        System.out.println("Its a draw");
                        break;
                    }
                }

                showField(field);
                humanMovie(field);
                if (isWin(field) || isDraw(field)) {
                    if (isWin(field)) {
                        showField(field);
                        System.out.println(symbolToChek + "is a Winner");
                        break;
                    } else if (isDraw(field)) {
                        showField(field);
                        System.out.println("Its a draw");
                        break;
                    }
                }
            }
        }
    }


    boolean isWin(String[][] field) {
        for (int i = 1; i < field.length; i++) {
            for (int j = 1; j < field[i].length; j++) {
                if (symbolToChek.equals(field[i][j])
                        && symbolToChek.equals(field[i - 1][j])
                        && symbolToChek.equals(field[i - 2][j])
                        && symbolToChek.equals(field[i - 3][j])) {
                    return true;
                } else if (symbolToChek.equals(field[i][j])
                        && symbolToChek.equals(field[i][j - 1])
                        && symbolToChek.equals(field[i][j - 2])
                        && symbolToChek.equals(field[i][j - 3])) {
                    return true;
                } else if (symbolToChek.equals(field[i][j])
                        && symbolToChek.equals(field[i - 1][j - 1])
                        && symbolToChek.equals(field[i - 2][j - 2])
                        && symbolToChek.equals(field[i - 3][j - 3])) {
                    return true;
                } else if (symbolToChek.equals(field[i][j])
                        && symbolToChek.equals(field[i - 1][j + 1])
                        && symbolToChek.equals(field[i - 2][j + 2])
                        && symbolToChek.equals(field[i - 3][j + 3])) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isDraw(String[][] field) {
        for (String[] strings : field) {
            for (String string : strings) {
                if (string.equals(thirdSymbol)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void humanMovie(String[][] field) {

        if (userOne.equals("Player")) {
            symbolToChek = firstSymbol;
        } else {
            symbolToChek = secondSymbol;
        }

        System.out.println("input column value");

        int temp = field.length - 1;
        Move move = new Move(scanner.nextInt());

        if (move.getValue() <= -1 || move.getValue() >= field.length) {
            System.out.println("EROR" + "\n" + "Try again");
            humanMovie(field);
        } else {

            while (!field[temp][move.getValue()].equals(thirdSymbol)) {
                temp--;
            }

            field[temp][move.getValue()] = symbolToChek;
        }
    }

    public void cpuMovie(String[][] field) {


        if (userOne.equals("CPU")) {
            symbolToChek = firstSymbol;
        } else {
            symbolToChek = secondSymbol;
        }

        int temp = field.length - 1;
        int value = generator(field);

        System.out.println(value);

        while (!field[temp][value].equals(thirdSymbol)) {
            temp--;
        }

        System.out.println(temp);

        if (field[temp][value].equals(thirdSymbol)) {
            field[temp][value] = symbolToChek;
        } else {
            cpuMovie(field);
        }
    }

    int generator(String[][] field) {
        Random random = new Random();
        int value = random.nextInt(15) + 1;
        while (value >= field.length) {
            value = random.nextInt(15) + 1;
        }
        return value;
    }
}
