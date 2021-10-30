package student_alberts_matrozis.lesson_11.level_2.UniqueWordFinder;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    static Set<String> find(String text) {
        Set<String> findedWords = new HashSet<>();
        String[] textArr = text.toLowerCase().split(" ");
        for (String word : textArr) {
            if (!findedWords.contains(word) && !word.isBlank()) {
                if (word.endsWith(".") || word.endsWith(",")) {
                    findedWords.add(word.substring(0, word.length() - 1));
                } else {
                    findedWords.add(word);
                }
            }
        }
        return findedWords;
    }
}
