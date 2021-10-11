package student_sergej_pereligin.lesson_6.level_4;


public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {

        TwoDimensionalArrayUtil twoDimensionalArrayUtil = new TwoDimensionalArrayUtil();

        int[][] crabArray = twoDimensionalArrayUtil.createTwoDimArray(5, 3);
        //System.out.println(Arrays.deepToString(crabArray));

        twoDimensionalArrayUtil.fillTwoDimArrayWithRandoms(crabArray);
        twoDimensionalArrayUtil.printArray(crabArray);
        twoDimensionalArrayUtil.sumOfAllElements(crabArray);


    }

}

