package student_josifs_makarenko.lesson_9.level7;

import java.util.Optional;

public class MyListImp implements MyList {
    //task 3
    public int[] increaseArray(int[] array) {
        int[] fakeArray = new int[array.length + 1];

        System.arraycopy(array, 0, fakeArray, 0, fakeArray.length - 1);
        return fakeArray;
    }


    public int[] decreaseArray(int[] array) {
        int[] fakeArray = new int[array.length - 1];

        System.arraycopy(array, 0, fakeArray, 0, fakeArray.length);
        return fakeArray;
    }


    @Override
    public int[] addNumberToArray(int[] array, int number) {

        int[] fakeArray = increaseArray(array);

        fakeArray[array.length] = number;
        return fakeArray;
    }

    @Override
    public Optional<int[]> removeFromArray(int[] array, int number) {

        Optional<int[]> result = Optional.empty();

        int[] fakeArray = new int[array.length];
        System.arraycopy(array, 0, fakeArray, 0, array.length);

        for (int i = 0; i < fakeArray.length; i++) {
            if (fakeArray[i] == number) {
                fakeArray[i] = fakeArray[array.length - 1];
                fakeArray[fakeArray.length - 1] = 0;

                fakeArray = decreaseArray(fakeArray);

                result = Optional.of(fakeArray);
                return  result;
            }
        }
        return result;
    }
}
