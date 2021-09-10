package student_einars_marhilevics.lesson_6.level_4;


import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = twoDimensionalArray.createArray(5, 5);
        twoDimensionalArray.fillArrayWithRandomNumbers(array);
        twoDimensionalArray.printArray(array);
        System.out.println("sum of all elements are = " + twoDimensionalArray.sumAllElements(array));
    }
    int[][] createArray ( int row, int column){
        return new int[row][column];
    }
    void fillArrayWithRandomNumbers ( int[][] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
        }
    }
    int sumAllElements ( int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    void printArray ( int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }
}
