package student_ruslan_pankratov.lesson_7.level_6;

import java.util.Arrays;
//Task_12
class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copyInRange();
    }

    void copyInRange(){
    ArrayCopy arrayCopy = new ArrayCopy();
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
    int[] result = arrayCopy.copyInRange(arr,14,3);
    int[] expectedResult = {1,2,3,14,15,16,17,18};

    if(Arrays.equals(result,expectedResult)){
        System.out.println("Test copyInRange = OK");
    } else {
        System.out.println("Test copyInRange = FAIL");
    }

  }
}
