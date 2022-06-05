package student_daniel.lesson11.level2_3_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder implements UniqueWord {
    //Task 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
    @Override
    public Set<String> find(String text) {
        return new HashSet<>(Arrays.asList(text.toLowerCase().split("[-.,:;?!~\\s]+")));
    }
}