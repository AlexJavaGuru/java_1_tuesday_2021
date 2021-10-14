package student_josifs_makarenko.lesson_9.level7;

import java.util.Optional;

//task_3
public interface MyList {
    int[] addNumberToArray (int[] array, int number);
    Optional<int[]> removeFromArray (int[] array, int number);
}
