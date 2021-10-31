package student_josifs_makarenko.lesson_7.level5;

public class PowerCalculator {

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println(powerCalculator.exponentiation(5, 10));
        System.out.println(powerCalculator.exponentiationForLazy(5, 10));
    }

    int exponentiationForLazy(int number, int power) {
        return (int) Math.pow(number, power);
    }

    int exponentiation(int number, int power) {
        int numberInPower = number;
        int[] tempArray = new int[power];
        for (int i = 0; i < tempArray.length - 1; i++) {
            numberInPower = numberInPower * number;
        }
        return numberInPower;
    }
}