package student_sergej_pereligin.lesson_11.level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {
    UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

    Set<String> find(String text) {
        String[] words = text.split("\\ss");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        return uniqueWords;
    }
}
