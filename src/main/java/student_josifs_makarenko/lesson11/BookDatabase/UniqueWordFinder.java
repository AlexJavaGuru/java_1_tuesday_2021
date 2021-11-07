package student_josifs_makarenko.lesson11.BookDatabase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    static Set<String> find(String text) {
        String[] array = text.split(" ");
        return new HashSet<>(Arrays.asList(array));
    }
}
