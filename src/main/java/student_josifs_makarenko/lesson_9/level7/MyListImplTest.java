package student_josifs_makarenko.lesson_9.level7;

import student_josifs_makarenko.lesson_9.level5.Book;

import java.util.Arrays;
import java.util.Optional;

public class MyListImplTest {
    public static void main(String[] args) {
        MyListImplTest myListImplTest = new MyListImplTest();
        myListImplTest.addNumberToArrayTest();
        myListImplTest.removeFromArrayTest1();
        myListImplTest.removeFromArrayTest2();
    }

    void addNumberToArrayTest() {
        MyList myList = new MyListImp();
        int[] array = new int[0];
        int[] expectedResult = {1};
        check(checkArrays(expectedResult, myList.addNumberToArray(array, 1)), "AddNumberToArray TEST");
    }

    void removeFromArrayTest1() {
        MyList myList = new MyListImp();
        int[] array = {1, 2};
        Optional<int[]> expectedResult = Optional.empty();
        check(myList.removeFromArray(array, 3) == expectedResult, "RemoveFromArray TEST");
    }

    void removeFromArrayTest2() {
        MyList myList = new MyListImp();
        int[] array = {1, 2};
        int[] expectedResult = {1};
        if (myList.removeFromArray(array, 2).isPresent()) {
            check(checkArrays(myList.removeFromArray(array, 2).get(), expectedResult), "RemoveFromArray TEST");
        }
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }

    static boolean checkArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
