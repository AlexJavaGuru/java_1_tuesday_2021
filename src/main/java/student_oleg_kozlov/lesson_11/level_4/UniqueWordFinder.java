package student_oleg_kozlov.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

// Task_27
class UniqueWordFinder {
    public Set<String> find(String text) {
        Set<String> result = new HashSet<>();
        String str = (text.replaceAll("[^a-zA-Zа-яА-Я]", " ")).toLowerCase();
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (!s.isBlank()) {
                result.add(s.trim());
            }
        }
        return result;
    }
}
