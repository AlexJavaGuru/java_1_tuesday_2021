package student_julija_kuzmicova.lesson_11.level_4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

//Task_27
class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> result = new HashSet<>();
        String[] array = text.toLowerCase(Locale.ROOT).replaceAll("[.,:;!?]", "").split("\\s");
        for(String word : array) {
            if(!word.isBlank()) {
                result.add(word);
            }
        }
        return result;
    }
}
