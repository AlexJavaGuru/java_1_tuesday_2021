package student_sergej_pereligin.lesson_5.level_5;

import java.util.Random;

/*Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
*/
/*Создайте в классе ArrayUtil метод для
заполнения массива случайными целыми числами.

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        // Напишите реализацию !!!
    }

}*/
public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
