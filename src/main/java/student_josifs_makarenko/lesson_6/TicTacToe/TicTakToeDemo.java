package student_josifs_makarenko.lesson_6.TicTacToe;

public class TicTakToeDemo {
    public static void main(String[] args) {

        TicTakToe ticTakToe = new TicTakToe();

        System.out.println("Before start we should toss a coin");
        ticTakToe.coinFlip();
        ticTakToe.turnCheck();

        ticTakToe.play();
    }
}
