package student_sergej_pereligin.lesson_6.level_3;
import java.util.Arrays;

public class ArrayServiceDemo {
    public static void main(String[] args) {

        int[] newArray = {1, 2, 2, 3, 3, 4, 5, 5, 5};
        //int[] nextArray = {4, 6, 1, 4, 8, 9, 3, 5};

        ArrayService newArrayService = new ArrayService();
        boolean numberToSearch = newArrayService.checkForNumber(newArray, 5);
        System.out.println(numberToSearch);
        int numberToCheck = newArrayService.numberOfOccurrences(newArray, 2);
        System.out.println(numberToCheck);
        boolean replaceFirstNumber = newArrayService.replaceFirstNumber(newArray, 5, 8);
        System.out.println(Arrays.toString(newArray));
        int replaceAllSameNumbers = newArrayService.replaceAllSameNumbers(newArray, 2, 9);
        System.out.println(Arrays.toString(newArray));
        newArrayService.revertArray(newArray);
        //Arrays.sort(nextArray);
        // System.out.println(Arrays.toString(nextArray));
        newArrayService.sortArray(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}
