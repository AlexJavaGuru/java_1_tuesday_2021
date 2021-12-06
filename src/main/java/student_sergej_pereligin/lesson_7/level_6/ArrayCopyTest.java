package student_sergej_pereligin.lesson_7.level_6;



import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copyInRangeTest();
        
    }
    
    public void copyInRangeTest(){
        ArrayCopy arrayCopy = new ArrayCopy();
        int [] victimArray = {1, 2, 3, 4, 5, 6};
        int [] actualResult = arrayCopy.copyInRange(victimArray, 1,5);
        int [] expectedResult = {1, 2, 3, 4, 5};
        checkResults(expectedResult, actualResult,"Copy in range");
    }
    
    
    public void checkResults(int [] expectedResult, int[] actualResult, String testName){
        if (Arrays.equals(expectedResult, actualResult)){
            System.out.println("Test " + testName + " passed!");
        }
        else{
            System.out.println("Test " + testName + " failed");
        }
    }
}
